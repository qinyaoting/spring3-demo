package org.framework.business.model.service.privilege;

import org.framework.business.model.dao.privilege.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;




/**
 * 
 * @author songjian @Mar 1, 2013
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	
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
