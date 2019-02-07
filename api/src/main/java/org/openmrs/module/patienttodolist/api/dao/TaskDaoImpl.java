package org.openmrs.module.patienttodolist.api.dao;

import org.hibernate.criterion.Restrictions;
import org.openmrs.api.db.hibernate.DbSession;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.patienttodolist.domains.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDaoImpl implements TasksDao {
	
	@Autowired
	private DbSessionFactory sessionFactory;
	
	private DbSession getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public Task getItemByUuid(String uuid) {
		return (Task) getSession().createCriteria(Task.class).add(Restrictions.eq("uuid", uuid)).uniqueResult();
	}
	
	@Override
	public List<Task> getAllTasks() {
		List<Task> tasks = getSession().createCriteria(Task.class).list();
		return tasks;
	}
}
