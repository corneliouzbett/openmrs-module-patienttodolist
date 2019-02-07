package org.openmrs.module.patienttodolist.api.impl;

import org.openmrs.api.APIException;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.patienttodolist.api.OpenmrsmoduletaskService;
import org.openmrs.module.patienttodolist.api.dao.TasksDao;
import org.openmrs.module.patienttodolist.domains.Task;

import java.util.List;

public class OpenmrsmoduletaskServiceImpl extends BaseOpenmrsService implements OpenmrsmoduletaskService {
	
	TasksDao tasksDao;
	
	public OpenmrsmoduletaskServiceImpl(TasksDao tasksDao) {
		this.tasksDao = tasksDao;
	}
	
	@Override
	public Task getTaskByUuid(String uuid) throws APIException {
		return null;
	}
	
	@Override
	public List<Task> getAllTasks() {
		return tasksDao.getAllTasks();
	}
}
