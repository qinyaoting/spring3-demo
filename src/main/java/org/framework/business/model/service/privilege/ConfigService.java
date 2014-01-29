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

    List<Config> getConfigList();

    List<String> getCountryList();

    boolean saveConfigId(String cfgid);

    boolean isCfgidExist(String cfgid);

    boolean saveConfigXml(String cfgid, String xml);

    Map<String,String> getConfigById(String cfgid);

    Map<String,String> getAppMap();

    boolean forceActiveConfig(String configid, String appid, String version);

    boolean activeConfig(String configid, String appid, String version);

    boolean updateConfigXmlByTagMap(String cfgid, Map<String,String> kv);
}
