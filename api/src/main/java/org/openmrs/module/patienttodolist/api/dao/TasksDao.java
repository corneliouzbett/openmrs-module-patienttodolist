package org.openmrs.module.patienttodolist.api.dao;

import org.openmrs.module.patienttodolist.domains.Task;

import java.util.List;

public interface TasksDao {
	
	List<Task> getAllTasks();
}
