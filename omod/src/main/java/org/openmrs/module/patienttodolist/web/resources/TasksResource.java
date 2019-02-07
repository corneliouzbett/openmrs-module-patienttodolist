package org.openmrs.module.patienttodolist.web.resources;

import org.openmrs.module.patienttodolist.domains.Task;
import org.openmrs.module.webservices.rest.web.RequestContext;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.impl.DataDelegatingCrudResource;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingResourceDescription;
import org.openmrs.module.webservices.rest.web.response.ResponseException;

@Resource(value = RestConstants.VERSION_1 + "/task")
public class TasksResource extends DataDelegatingCrudResource<Task> {
	
	@Override
	public Task getByUniqueId(String s) {
		return null;
	}
	
	@Override
	protected void delete(Task task, String s, RequestContext requestContext) throws ResponseException {
		
	}
	
	@Override
	public Task newDelegate() {
		return null;
	}
	
	@Override
	public Task save(Task task) {
		return null;
	}
	
	@Override
	public void purge(Task task, RequestContext requestContext) throws ResponseException {
		
	}
	
	@Override
	public DelegatingResourceDescription getRepresentationDescription(Representation representation) {
		return null;
	}
}
