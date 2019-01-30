package org.openmrs.module.patienttodolist.api;

import org.openmrs.annotation.Authorized;
import org.openmrs.api.APIException;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.patienttodolist.Task;
import org.springframework.transaction.annotation.Transactional;

public interface OpenmrsmoduletaskService extends OpenmrsService {
	
	@Authorized()
	@Transactional(readOnly = true)
	Task getTaskByUuid(String uuid) throws APIException;
}
