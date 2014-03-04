package org.framework.business.model.dao.privilege;

import org.framework.business.model.dao.base.BaseDaoImpl;
import org.framework.xcode.nosql.redis.RedisSpringProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author songjian @Mar 1, 2013
 */
@Repository
public class ConfigDaoImpl extends BaseDaoImpl implements ConfigDao {


}
