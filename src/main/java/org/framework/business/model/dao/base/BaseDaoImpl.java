package org.framework.business.model.dao.base;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;



/**
 * 
 * dao 基本实现
 * @author songjian @Mar 1, 2013
 */
@Repository
public class BaseDaoImpl implements BaseDao {

	//实体管理器
	@PersistenceContext
	protected EntityManager em;
	
	@Override
	public <T> T getById(Class<T> clazz, Object id) {
		//类型,主键值
		return em.find(clazz,id);
	}
	
	@Override
	public void save(Object entity) {
		em.persist(entity);
	}

}
