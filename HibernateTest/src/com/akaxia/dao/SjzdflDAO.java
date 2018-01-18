package com.akaxia.dao;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.akaxia.po.Sjzdfl;

/**
 * A data access object (DAO) providing persistence and search support for
 * Sjzdfl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.akaxia.po.Sjzdfl
 * @author MyEclipse Persistence Tools
 */

public class SjzdflDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(SjzdflDAO.class);
	// property constants
	public static final String SJZDFLMC = "sjzdflmc";

	public void save(Sjzdfl transientInstance) {
		log.debug("saving Sjzdfl instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sjzdfl persistentInstance) {
		log.debug("deleting Sjzdfl instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sjzdfl findById(java.lang.Integer id) {
		log.debug("getting Sjzdfl instance with id: " + id);
		try {
			Sjzdfl instance = (Sjzdfl) getSession().get("com.akaxia.po.Sjzdfl",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Sjzdfl instance) {
		log.debug("finding Sjzdfl instance by example");
		try {
			List results = getSession().createCriteria("com.akaxia.po.Sjzdfl")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Sjzdfl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sjzdfl as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySjzdflmc(Object sjzdflmc) {
		return findByProperty(SJZDFLMC, sjzdflmc);
	}

	public List findAll() {
		log.debug("finding all Sjzdfl instances");
		try {
			String queryString = "from Sjzdfl";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Sjzdfl merge(Sjzdfl detachedInstance) {
		log.debug("merging Sjzdfl instance");
		try {
			Sjzdfl result = (Sjzdfl) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Sjzdfl instance) {
		log.debug("attaching dirty Sjzdfl instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sjzdfl instance) {
		log.debug("attaching clean Sjzdfl instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}