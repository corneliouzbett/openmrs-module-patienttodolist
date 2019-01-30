package org.openmrs.module.patienttodolist.api.dao;

import org.hibernate.criterion.Restrictions;
import org.openmrs.api.db.hibernate.DbSession;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.patienttodolist.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("patienttodolist.TasksDao")
public class TasksDao {
	
	@Autowired
	private DbSessionFactory sessionFactory;
	
	private DbSession getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public Task getItemByUuid(String uuid) {
		return (Task) getSession().createCriteria(Task.class).add(Restrictions.eq("uuid", uuid)).uniqueResult();
	}
	
}
