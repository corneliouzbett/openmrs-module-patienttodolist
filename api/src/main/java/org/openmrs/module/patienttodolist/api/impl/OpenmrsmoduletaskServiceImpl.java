package org.openmrs.module.patienttodolist.api.impl;

import org.openmrs.api.APIException;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.patienttodolist.Task;
import org.openmrs.module.patienttodolist.api.OpenmrsmoduletaskService;

public class OpenmrsmoduletaskServiceImpl extends BaseOpenmrsService implements OpenmrsmoduletaskService {
	
	@Override
	public Task getTaskByUuid(String uuid) throws APIException {
		return null;
	}
}
