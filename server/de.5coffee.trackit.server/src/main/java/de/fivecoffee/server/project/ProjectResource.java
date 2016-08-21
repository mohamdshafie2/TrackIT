package de.fivecoffee.server.project;

import java.util.List;

import javax.ws.rs.Path;

import de.fivecoffee.trackit.model.project.Project;

@Path("/")
public class ProjectResource {
	@Path("projects")
	public List<Project> listProjects() {
		return null;
	}
}
