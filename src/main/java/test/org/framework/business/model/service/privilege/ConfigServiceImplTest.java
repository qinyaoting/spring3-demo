package test.org.framework.business.model.service.privilege; 

import org.framework.xcode.httpclient.HttpRequest;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

/** 
* ConfigServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>Jan 29, 2014</pre> 
* @version 1.0 
*/ 
public class ConfigServiceImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getConfigList() 
* 
*/ 
@Test
public void testGetConfigList() throws Exception {

    String result = HttpRequest.get("http://localhost:8080/api/config/find").body();
    assertNotNull(result);
}

/** 
* 
* Method: getCountryList() 
* 
*/ 
@Test
public void testGetCountryList() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: getAppMap() 
* 
*/ 
@Test
public void testGetAppMap() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: saveConfigId(String cfgid) 
* 
*/ 
@Test
public void testSaveConfigId() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: saveConfigXml(String cfgid, String xml) 
* 
*/ 
@Test
public void testSaveConfigXml() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: uploadToServer(String uploadUrl, String data) 
* 
*/ 
@Test
public void testUploadToServer() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: isCfgidExist(String cfgid) 
* 
*/ 
@Test
public void testIsCfgidExist() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: getConfigXmlById(String cfgid) 
* 
*/ 
@Test
public void testGetConfigXmlById() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: getConfigById(String cfgid) 
* 
*/ 
@Test
public void testGetConfigById() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: getPropertyMap(String xml) 
* 
*/ 
@Test
public void testGetPropertyMap() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: parseConfigXml(String xml, DynamicBean bean) 
* 
*/ 
@Test
public void testParseConfigXml() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: escape4html(String str) 
* 
*/ 
@Test
public void testEscape4html() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: forceActiveConfig(String configid, String appid, String version) 
* 
*/ 
@Test
public void testForceActiveConfig() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: activeConfig(String configid, String appid, String version) 
* 
*/ 
@Test
public void testActiveConfig() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: updateConfigXmlByTagMap(String cfgid, Map<String,String> kv) 
* 
*/ 
@Test
public void testUpdateConfigXmlByTagMap() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: getById(Class<T> clazz, Object id) 
* 
*/ 
@Test
public void testGetById() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: save(Object entity) 
* 
*/ 
@Test
public void testSave() throws Exception { 
//TODO: TestRedis goes here...
} 


} 
