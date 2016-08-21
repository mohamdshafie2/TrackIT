package de.fivecoffee.server;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import de.fivecoffee.server.project.ProjectResource;

public class JaxRsApplication {
	@ApplicationPath("one")
	public class JAXRSConfigurationOne extends Application {
		@Override
		public Set<Class<?>> getClasses() {
			Set<Class<?>> resources = new HashSet<>();
			resources.add(ProjectResource.class);
			return resources;
		}
	}
}
