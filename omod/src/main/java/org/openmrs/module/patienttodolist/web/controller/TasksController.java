package org.openmrs.module.patienttodolist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("${rootrootArtifactId}.TaskController")
@RequestMapping(value = "module/tasks")
public class TasksController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String onGet() {
		return "hello world";
	}
}
