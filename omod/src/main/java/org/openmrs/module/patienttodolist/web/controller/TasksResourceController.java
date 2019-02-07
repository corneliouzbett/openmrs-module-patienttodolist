package org.openmrs.module.patienttodolist.web.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.patienttodolist.api.OpenmrsmoduletaskService;
import org.openmrs.module.patienttodolist.domains.Task;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/rest/" + RestConstants.VERSION_1 + "/task")
public class TasksResourceController {
	
	private OpenmrsmoduletaskService openmrsmoduletaskService = Context.getService(OpenmrsmoduletaskService.class);
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Task> getAllTasks() {
		List<Task> tasks = openmrsmoduletaskService.getAllTasks();
		return tasks;
	}
}
