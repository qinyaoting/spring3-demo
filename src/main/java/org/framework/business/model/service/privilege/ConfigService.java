package org.framework.business.model.service.privilege;

import org.framework.business.model.entity.Config;
import org.framework.business.model.service.base.BaseService;

import java.util.List;
import java.util.Map;


/**
 * 
 * @author songjian @Mar 1, 2013
 */
public interface ConfigService extends BaseService {

    public static final String CONFIG_API = "http://localhost:8080/";
    public static final String CONFIG_LIST = CONFIG_API + "find";
    public static final String ADD_CONFIG_ID = CONFIG_API + "add";
    public static final String READ_CONFIG = CONFIG_API + "read";

    public static final String APP_LIST = CONFIG_API + "listapps";

    public static final String FORCE_SET = CONFIG_API + "forcedset";

    public static final String SET = CONFIG_API + "add";

    List<Config> getConfigList();

    List<String> getCountryList();

    boolean saveConfig(String name);

    boolean isConfigExist(String name);

    boolean saveConfigXml(String name, String xml);

    Map<String,String> getConfigByName(String name);

    Map<String,String> getAppMap();

    boolean forceActiveConfig(String name, String appid, String version);

    boolean activeConfig(String name, String appid, String version);

    boolean updateConfigXmlByTagMap(String name, Map<String,String> kv);
}
