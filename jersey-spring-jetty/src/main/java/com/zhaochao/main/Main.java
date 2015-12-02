package com.zhaochao.main;

import org.eclipse.jetty.server.Server;

import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		ServletHolder jerseyServlet = new ServletHolder(new ServletContainer(applicationConfig));
		ServletContextHandler context = new ServletContextHandler();
		context.setContextPath("/");
		context.addServlet(jerseyServlet, "/rest/*");
		context.addEventListener(new ContextLoaderListener());
		context.addEventListener(new RequestContextListener());
		context.setInitParameter("contextClass", AnnotationConfigWebApplicationContext.class.getName());
		context.setInitParameter("contextConfigLocation", SpringJavaConfiguration.class.getName());
		int port=8080;
		if(args.length==1){
			port=Integer.parseInt(args[0]);
		}
		Server server = new Server(port);
		server.setHandler(context);
		try {
			server.start();
			server.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
