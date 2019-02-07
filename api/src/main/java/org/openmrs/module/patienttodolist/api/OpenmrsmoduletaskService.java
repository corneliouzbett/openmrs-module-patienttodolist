package org.openmrs.module.patienttodolist.api;

import org.openmrs.annotation.Authorized;
import org.openmrs.api.APIException;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.patienttodolist.domains.Task;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OpenmrsmoduletaskService extends OpenmrsService {
	
	@Authorized()
	@Transactional(readOnly = true)
	Task getTaskByUuid(String uuid) throws APIException;
	
	@Authorized("view tasks")
	@Transactional
	List<Task> getAllTasks();
}
