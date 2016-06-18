package sg.dutech.planpro.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import sg.dutech.planpro.dao.GenericDAO;

public class GenericDAOImpl<T> extends HibernateDaoSupport implements GenericDAO<T> {

	private String className;

	public GenericDAOImpl(String className) {
		this.className = className;
	}
	
	public void save(T obj) {
		this.getHibernateTemplate().save(obj);
		
	}

	public void update(T obj) {
		this.getHibernateTemplate().update(obj);
		
	}

	public void delete(T obj) {
		this.getHibernateTemplate().delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public T findById(Serializable id) {
		Class<?> c=null;
		try{
			c=Class.forName(className);
		}catch(ClassNotFoundException e)
		{
			logger.trace("class not found");
			e.printStackTrace();
		}
		//TODO To check if c is null, whether throw a system exception in the backend which is un-userfriendly
		return (T) this.getHibernateTemplate().get(c, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return (List<T>) this.getHibernateTemplate().find("from "+className);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByNamedQuery(String queryName, Object... values) {
		return this.getHibernateTemplate().findByNamedQuery(queryName, values);
	}

	
	@SuppressWarnings("unchecked")
	public List<T> findByCriteria(DetachedCriteria detachedCriteria) {
		return  this.getHibernateTemplate().findByCriteria(detachedCriteria);
	}
	
}
