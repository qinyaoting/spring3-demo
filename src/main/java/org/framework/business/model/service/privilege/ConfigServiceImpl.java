package org.framework.business.model.service.privilege;

import org.framework.business.model.dao.privilege.UserDao;
import org.framework.business.model.entity.Config;
import org.framework.business.model.entity.DynamicBean;
import org.framework.xcode.httpclient.HttpRequest;
import org.framework.xcode.httpclient.XinXmlElementNode;
import org.framework.xcode.httpclient.XinXmlParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.xml.sax.SAXException;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author xyz @Mar
 */
@Service("configService")
public class ConfigServiceImpl implements ConfigService {


    public List<Config> getConfigList() {
        String result = HttpRequest.get(CONFIG_LIST).body();
        List<Config> cfgidList = null;
        XinXmlElementNode node;
        try {
            node = new XinXmlParser().parseString(result);
            if (null != node) {
                cfgidList = new ArrayList<Config>();
                XinXmlElementNode[] cfgids = node.getElements("cfgid");
                for (XinXmlElementNode cNode : cfgids) {
                    Config config = new Config();
                    String isActived = cNode.getAttribute("active");
                    if ("true".equals(isActived)) config.setActived(isActived);
                    config.setCfgid(cNode.getText());
                    cfgidList.add(config);
                }
            }
        } catch (IOException e) {
            //vulogger.error("Parser result error:" + e.toString());
        } catch (FactoryConfigurationError e) {
            //vulogger.error("Parser result error:" + e.toString());
        } catch (ParserConfigurationException e) {
            //vulogger.error("Parser result error:" + e.toString());
        } catch (SAXException e) {
            //vulogger.error("Parser result error:" + e.toString());
        }
        return cfgidList;
    }

    public List<String> getCountryList() {
        List<String> countryList = new ArrayList<String>();
        countryList.add("train_geo_IN_AP");
        countryList.add("train_geo_IN_UP");
        countryList.add("train_geo_set_ME");
        return countryList;
    }

    public Map<String,String> getAppMap() {
        String result = HttpRequest.get(APP_LIST).body();

        Map<String,String> appMap = null;
        XinXmlElementNode node;
        try {
            node = new XinXmlParser().parseString(result);
            if (null != node) {
                String suc = node.getAttribute("status");
                if ("success".equals(suc)) {
                    appMap = new HashMap<String,String>();
                    XinXmlElementNode[] appIds = node.getElements("app");
                    for (XinXmlElementNode cNode : appIds) {

                        String app = cNode.getAttribute("id");
                        String ver = cNode.getAttribute("ver");
                        appMap.put(app,ver);
                    }
                } else {
                    //解析错误信息
                }

            } else {
                //解析错误信息
            }
        } catch (IOException e) {
            //vulogger.error("Parser result error:" + e.toString());
        } catch (FactoryConfigurationError e) {
        } catch (ParserConfigurationException e) {
        } catch (SAXException e) {
        }
        return appMap;
    }

    public boolean saveConfigId(String cfgid) {
        boolean isSaveSuccess = false;
        String url = ADD_CONFIG_ID + "?cfgid="+cfgid;
        String result = HttpRequest.get(url).body();
        try {
            XinXmlElementNode node = new XinXmlParser().parseString(result);
            if (null != node) {
                String status = node.getAttribute("status");
                if ("success".equals(status)) {
                    isSaveSuccess = true;
                } else if ("failure".equals(status)) {

                }

            } else {
                //解析错误信息
            }
        } catch (IOException e) {
            //vulogger.error("Parser result error:" + e.toString());
        } catch (FactoryConfigurationError e) {
        } catch (ParserConfigurationException e) {
        } catch (SAXException e) {
        }
        return isSaveSuccess;
    }

    public boolean saveConfigXml(String cfgid, String xml) {

        String url = ADD_CONFIG_ID + "?cfgid=" + cfgid;
        boolean flag = false;
        try {
            int statusCode = uploadToServer(url, xml);
            if (statusCode == 200) flag = true;
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return flag;
    }

    public int uploadToServer(String uploadUrl, String data) throws Exception {
        OutputStream os;
        URL url = new URL(uploadUrl);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setDoOutput(true);
        os = httpConn.getOutputStream();
        BufferedWriter osw = new BufferedWriter(new OutputStreamWriter(os));
        osw.write(data);
        osw.flush();
        osw.close();
        return httpConn.getResponseCode();

    }

    public boolean isCfgidExist(String cfgid) {

        List<Config> configList = getConfigList();
        List<String> cfgids = new ArrayList<String>();
        for (Config cfg : configList) {
            cfgids.add(cfg.getCfgid());
        }
        return cfgids.contains(cfgid);
    }

    protected String getConfigXmlById(String cfgid) {
        return HttpRequest.get(READ_CONFIG + "?cfgid="+cfgid).body();
    }

    public Map<String,String> getConfigById(String cfgid) {

        String xml = getConfigXmlById(cfgid);
        Map<String,String> map = null;
        XinXmlElementNode node;
        try {
            map = new HashMap<String, String>();
            node = new XinXmlParser().parseString(xml);
            if (null != node) {
                //config = new Config();
                String timestamp = node.getAttribute("timestamp");
                String status = node.getAttribute("status");
                //config.setTimestamp(timestamp);
                //config.setStatus(status);

                XinXmlElementNode[] childNodes = node.getElements("avp");
                for (XinXmlElementNode childNode : childNodes) {
                    String name =  childNode.getAttribute("a");
                    //name = name.replaceAll("\\.","_");
                    String value = childNode.getText();
                    //if ("".equals(value)) continue;
                    //bean.setValue(name, escape4html(value));
                    map.put(name,escape4html(value));
                }
            }
        } catch (IOException e) {
            //vulogger.error("Parser result error:" + e.toString());
        } catch (FactoryConfigurationError e) {
        } catch (ParserConfigurationException e) {
        } catch (SAXException e) {
        }
        return map;
    }

    protected HashMap getPropertyMap(String xml) throws ClassNotFoundException, ParserConfigurationException, SAXException, IOException {
        HashMap propertyMap = new HashMap();
        XinXmlElementNode node = new XinXmlParser().parseString(xml);
        if (null != node) {
            XinXmlElementNode[] childNodes = node.getElements("avp");
            propertyMap = new HashMap();
            for (XinXmlElementNode childNode : childNodes) {
                String paramName = childNode.getAttribute("a");
                paramName = paramName.replaceAll("\\.","_");
                propertyMap.put(paramName, Class.forName("java.lang.String"));
            }
        }
        return propertyMap;
    }

    protected Object parseConfigXml(String xml, DynamicBean bean) throws ClassNotFoundException {

        XinXmlElementNode node;
        try {
            node = new XinXmlParser().parseString(xml);
            if (null != node) {
                //config = new Config();
                String timestamp = node.getAttribute("timestamp");
                String status = node.getAttribute("status");
                //config.setTimestamp(timestamp);
                //config.setStatus(status);

                XinXmlElementNode[] childNodes = node.getElements("avp");
                for (XinXmlElementNode childNode : childNodes) {
                    String name =  childNode.getAttribute("a");
                    name = name.replaceAll("\\.","_");
                    String value = childNode.getText();
                    if ("".equals(value)) continue;
                    bean.setValue(name, escape4html(value));
                }
            }
        } catch (IOException e) {
            //vulogger.error("Parser result error:" + e.toString());
        } catch (FactoryConfigurationError e) {
        } catch (ParserConfigurationException e) {
        } catch (SAXException e) {
        }
        return bean.getObject();
    }

    public static String escape4html(String str){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c =='"')
                sb.append("&quot;");
            else if(c =='<')
                sb.append("&lt;");
            else if(c =='>')
                sb.append("&gt;");
            else
                sb.append(c);
        }
        return sb.toString();
    }

    public boolean forceActiveConfig(String configid, String appid, String version) {
        boolean isUpdateSuccess = false;

        String url = "";
        if ("default".equals(version) || "".equals(version)) {
            url = FORCE_SET + "?cfgid=" + configid + "&appid=" + appid;
        } else {
            url = FORCE_SET + "?cfgid=" + configid + "&appid=" + appid + "&ver=" + version;
        }
        String result = HttpRequest.get(url).body();
        try {
            XinXmlElementNode node = new XinXmlParser().parseString(result);
            if (null != node) {
                String status = node.getAttribute("status");
                if ("success".equals(status)) {
                    //message = "Set active success";
                    isUpdateSuccess = true;
                } else if ("failure".equals(status)) {
                    //message = "The Appid already active with version ( " +version + " )";//node.getElementText("error");
                }

            } else {
                //解析错误信息
            }
        } catch (IOException e) {
            //vulogger.error("Parser result error:" + e.toString());
        } catch (FactoryConfigurationError e) {
        } catch (ParserConfigurationException e) {
        } catch (SAXException e) {
        }

        return isUpdateSuccess;
    }

    public boolean activeConfig(String configid, String appid, String version) {
        boolean isUpdateSuccess = false;

        String url = "";
        if ("default".equals(version) || "".equals(version)) {
            url = SET + "?cfgid=" + configid + "&appid=" + appid;
        } else {
            url = SET + "?cfgid=" + configid + "&appid=" + appid + "&ver=" + version;
        }
        String result = HttpRequest.get(url).body();
        try {
            XinXmlElementNode node = new XinXmlParser().parseString(result);
            if (null != node) {
                String status = node.getAttribute("status");
                if ("success".equals(status)) {
                    //message = "Set active success";
                    isUpdateSuccess = true;
                } else if ("failure".equals(status)) {
                    //message = "The Appid already active with version ( " +version + " )";//node.getElementText("error");
                }

            } else {
                //解析错误信息
            }
        } catch (IOException e) {
            //vulogger.error("Parser result error:" + e.toString());
        } catch (FactoryConfigurationError e) {
        } catch (ParserConfigurationException e) {
        } catch (SAXException e) {
        }

        return isUpdateSuccess;
    }

    public boolean updateConfigXmlByTagMap(String cfgid, Map<String,String> kv) {
        boolean flag = false;
        if (null == cfgid || "".equals(cfgid) || null == kv) return flag;
        String url = ADD_CONFIG_ID + "?cfgid=" + cfgid;
        StringBuilder sb = new StringBuilder("<config>");
        for(String key : kv.keySet())
            sb.append("<avp a=\"" + key + "\">"+kv.get(key)+"</avp>");
        sb.append("</config>");
        try {
            byte[] xml = sb.toString().getBytes();
            InputStream is = HttpRequest.post(url).send(xml).stream();
            String status = new ConfigXmlHandler().getStatus(is);
            // String response = HttpRequest.post(url).send(xml).body();
            // <?xml version="1.0" encoding="UTF-8"?><response status="success"/>
            if ("success".equals(status))  flag = true;
        }catch (Exception e) {

        }
        return flag;
    }













	@Autowired
    private UserDao userDao;


	@Override
	@Cacheable(value="userCache")//缓存数据
	public <T> T getById(Class<T> clazz, Object id) {
		return userDao.getById(clazz,id);
	}

	@Override
    @Transactional(propagation=Propagation.REQUIRED)
	@CacheEvict(value="userCache",allEntries=true)//清除缓存
	public void save(Object entity) {
    	userDao.save(entity);
	}

}
