package org.framework.business.app.controller;

import org.framework.business.app.vo.TestForm;
import org.framework.business.model.entity.Config;
import org.framework.business.model.entity.UserInfo;
import org.framework.business.model.service.privilege.ConfigService;
import org.framework.business.model.service.privilege.UserService;
import org.framework.xcode.nosql.redis.RedisSpringProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.*;
import java.util.Map.Entry;


@Controller
@RequestMapping(value="/config")
public class ConfigController {

	private final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(getClass());
	
	@Autowired
    private UserService userService;//注入业务接口
    @Autowired
    private ConfigService configService;//注入业务接口

	@RequestMapping(value="/index.action",method=RequestMethod.GET)
	public String index(ModelMap modelMap){
        List<Config> configList= configService.getConfigList();
        modelMap.addAttribute("configList",configList);







        return "config/index";
	}

    @RequestMapping(value="/new.action",method=RequestMethod.GET)
    public String newConfig(ModelMap modelMap){

        modelMap.addAttribute("countryList",configService.getCountryList());
        modelMap.addAttribute("geoList",getGeoList());
        modelMap.addAttribute("tagList",getTagList());
        return "config/new";
    }

    @RequestMapping(value="/step1.action",method=RequestMethod.GET)
    public String step1(ModelMap modelMap){

        //modelMap.addAttribute("countryList",configService.getCountryList());
        //modelMap.addAttribute("geoList",getGeoList());
        //modelMap.addAttribute("tagList",getTagList());
        return "config/step1";
    }

    private String[] getGeoList () {
        return new String[]{"geo.IN.AP","geo.IN.UP","geo.US","geo.CN"};
    }

    private String[] getTagList () {
        return new String[]{"homepage.xml","homepage.ad.banner.id","childpage.ad.banner.id","player.ad.vast.id","player.ad.inter.id"};
    }

    @RequestMapping(value="/create.action",method=RequestMethod.POST)
    public ModelAndView saveConfigByConfigId(@RequestParam(value = "cfgid", required = true) String cfgid, ModelMap modelMap, HttpServletResponse response, HttpServletRequest request){

        Map<String,String> map = new HashMap<String,String>();
        Map<String,String> filteredmap = new HashMap<String,String>();
        Enumeration paraNames = request.getParameterNames();
        while (paraNames.hasMoreElements()){
            String paramName = (String)paraNames.nextElement();
            String value = request.getParameter(paramName);
            map.put(paramName, value);
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            /*
            tagname input -------------tagvalue input
            [tagname1,version.latest] [tagvalue1,1.3.1]
            [tagname2,version.block] [tagvalue, 1.0.2,1.2.2]
             .............name....................value............
             */
            if (key.equals("name"))
                continue;
            if (key.contains("tagname")) {
                String num = key.split("tagname")[1];
                String tagName = map.get(key);
                String tagValue = map.get("tagvalue" + num);
                filteredmap.put(tagName,tagValue.trim());
            } else {
                if (!key.contains("tagvalue"))
                    filteredmap.put(key,map.get(key));
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<config>");
        for (String key : filteredmap.keySet()) {
            String value = filteredmap.get(key);
            String val = "<![CDATA[" + value + "]]>";
            sb.append("<avp a=\"" + key + "\">" + value + "</avp>");
        }
        sb.append("</config>");

        boolean isSucc = configService.saveConfigXml(cfgid, sb.toString());
        //modelMap.addAttribute("config",new Config());
        //modelMap.addAttribute("countryList",configService.getCountryList());
        //modelMap.addAttribute("userInfo",new UserInfo());

        //return "config/index";
        ModelAndView view = new ModelAndView();
        view.setViewName("redirect:index.action");
        return view;

        // xx return "forward:/config/index";
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public @ResponseBody String saveConfigId(@RequestParam(value = "name", required = true) String name, Model model) {
        String message = "Save failed , try again later";
        if (configService.isConfigExist(name)) {
            message = "The config id already exist";
        } else {
            boolean isSucc = configService.saveConfig(name);
            if (isSucc) {
                message = "Success";
                LOG.error("cfgid="+name);
            } else {
                message = "Save data failed, try again later";
            }
        }
        String jsonStr = "{\"message\":\""+message+"\"}";
        return jsonStr;
    }

    @RequestMapping(value="/edit.action",method=RequestMethod.GET)
    public String editConfig(@RequestParam(value = "name", required = true) String name, Model model){

        String message = "Save failed , try again later";
        if (configService.isConfigExist(name)) {
            Map<String,String> allConfigMap = configService.getConfigByName(name);
            Map<String,Map> regiontag = new HashMap<String,Map>();
            Map<String, String> othertag = new HashMap<String, String>();
            othertag.putAll(allConfigMap);


            String[] tags = getTagList();
            for(String tag : tags) {

                Map<String,String> regionTagMap = new HashMap<String, String>();
                for(String key : allConfigMap.keySet()) {

                    if (key.startsWith(tag)) {
                        String val = allConfigMap.get(key);
                        if (val != null && !"".equals(val))
                            regionTagMap.put(key,val);
                        othertag.remove(key);
                    }
                    if (key.equals("cfgid"))
                        othertag.remove(key);
                    String val = allConfigMap.get(key);
                    if (val == null || "".equals(val))
                        othertag.remove(key);
                }
                regiontag.put(tag,regionTagMap);
            }
            model.addAttribute("cfgid",name);
            model.addAttribute("regiontag",regiontag);
            model.addAttribute("othertag",othertag);
            model.addAttribute("geoList",getGeoList());
            model.addAttribute("tagList",getTagList());
        }
        return "config/edit";
    }

    @RequestMapping(value="/set.action",method=RequestMethod.GET)
    public String setConfig(@RequestParam(value = "name", required = true) String name, ModelMap modelMap){
        Map<String,String> apps = configService.getAppMap();
        modelMap.addAttribute("apps",apps);
        modelMap.addAttribute("currcfgid",name);
        return "config/set";
    }

    @RequestMapping(value = "/active.action", method = {RequestMethod.POST})
    public String activeConfig(@RequestParam(value = "cfgid", required = true) String cfgid, Model model, HttpServletResponse response, HttpServletRequest request){
        //String cfgid = request.getParameter("cfgid");
        String message = "Update failed , try again later";
        String appid = request.getParameter("appid");
        String version = request.getParameter("version");   //ex: default 2.0.1
        String force = request.getParameter("force");
        boolean isUpdateSuccess = false;
        if (!isEmptyOrNull(cfgid) && !isEmptyOrNull(appid) ) {
            if ("true".equals(force)) {
                System.out.println("force");
                isUpdateSuccess = configService.forceActiveConfig(cfgid, appid, version);
            } else {
                isUpdateSuccess = configService.activeConfig(cfgid, appid, version);
            }
            if (isUpdateSuccess) {
                message = "Set active success";
                Map<String,String> map = new HashMap<String,String>();
                map.put("appid",appid);
                map.put("version",version);
                configService.updateConfigXmlByTagMap(cfgid, map);
            } else {
                message = "The config id with appid-version alreay actived , ";
                model.addAttribute("FORCE","true");
            }
        } else {
            message = "Config id or app id can't be blank.";
        }
        if (isUpdateSuccess) {
            return  "redirect:index.action";
        } else {
            model.addAttribute("MESSAGE",message);
            model.addAttribute("currcfgid",cfgid);
            model.addAttribute("appid",appid);
            model.addAttribute("version",version);
            Map<String,String> apps = configService.getAppMap();
            model.addAttribute("apps",apps);
            return  "config/set";
        }

    }

    @RequestMapping(value = "/create_group", method = RequestMethod.POST)
    public @ResponseBody String createGroup(@RequestParam(value = "groupname", required = true) String groupname, Model model) {
        String message = "Save failed , try again later";
        //====
        if (configService.isConfigExist(groupname)) {
            message = "The group already exist";
        } else {
            boolean isSucc = configService.saveConfig(groupname);
            if (isSucc) {
                message = "Success";
                LOG.error("cfgid="+groupname);
            } else {
                message = "Save data failed, try again later";
            }
        }
        String jsonStr = "{\"message\":\""+message+"\"}";
        return jsonStr;
    }













    @RequestMapping(value = "/save-user.action", method = {RequestMethod.POST})
	public String toSaveUser(@ModelAttribute("userInfo") @Valid UserInfo userInfo, BindingResult bindingResult, ModelMap modelMap){
		if (bindingResult.hasErrors()) {
			modelMap.addAttribute("hasErrors", true);
			LOG.debug(modelMap.get("default message")+"__________________________________________1");
			for(Entry<String,Object> e: modelMap.entrySet()){
				LOG.debug("get\t"+e.getKey()+"\t\t>>"+e.getValue());
			}
			LOG.debug("__________________________________________2");
			return "user/add-user";
		}
		long t1 = System.currentTimeMillis();
		userService.save(userInfo);
		long t2 = System.currentTimeMillis();
		Calendar c=Calendar.getInstance();
		c.setTimeInMillis(t2-t1); 
		LOG.debug("======================="+c.get(Calendar.SECOND) + "秒 " + c.get(Calendar.MILLISECOND) + " 微秒");
		return "ok/sccuess";
	}
	
	/**
	 * 页面传递2个对象
	 * @param test
	 * @param bindingResult
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/test.action", method = {RequestMethod.POST})
	public String test(@Valid TestForm test, BindingResult bindingResult, ModelMap modelMap){
		if (bindingResult.hasErrors()) {
			modelMap.addAttribute("hasErrors", true);
			return "user/test";
		}
		long t1 = System.currentTimeMillis();
		userService.save(test.getUserInfo());
		long t2 = System.currentTimeMillis();
		Calendar c=Calendar.getInstance();
		c.setTimeInMillis(t2-t1); 
		LOG.debug("======================="+c.get(Calendar.SECOND) + "秒 " + c.get(Calendar.MILLISECOND) + " 微秒");
		return "ok/sccuess";
	}
	
	@RequestMapping(value = "/totest.action", method = {RequestMethod.GET})
	public String totest(){
		return "user/test";	
	}

    protected boolean isEmptyOrNull(String value) {
        return value == null || value.trim().length() == 0;
    }
}
