package org.framework.business.model.service.base;



/**
 * 
 * @author songjian @Mar 1, 2013
 */
public interface BaseService {

    public static final String CONFIG_API = "http://localhost:8080/api/config/";
    public static final String CONFIG_LIST = CONFIG_API + "find";
    public static final String ADD_CONFIG_ID = CONFIG_API + "add";
    public static final String READ_CONFIG = CONFIG_API + "read";

    public static final String APP_LIST = CONFIG_API + "listapps";

    public static final String FORCE_SET = CONFIG_API + "forcedset";

    public static final String SET = CONFIG_API + "set";

	/**
     * 保存实体
     * @param entity
     */
    void save(Object entity);
    
    /**
     * 根据主键获取对象
     * @param <T>
     * @param clazz 实体类
     * @param id    主键
     * @return
     */
    <T> T getById(Class<T> clazz,Object id);

	
}
