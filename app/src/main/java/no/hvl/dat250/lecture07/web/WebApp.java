package no.hvl.dat250.lecture07.web;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * This application is meant to demonstrate
 * how to re-create Spring Boot functionality
 * from scract manually.
 */
public class WebApp {

    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat(); // create an embedded tomcat
        tomcat.setPort(8080);
        tomcat.getConnector(); // bind to TCP port
        Context webContext = tomcat.addContext("", System.getProperty("java.io.tmpdir")); // handling root context
        AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext(); // init Spring IoC context
        springContext.setServletContext(webContext.getServletContext()); // tell Spring about the web context
        springContext.register(WebConfig.class);
        springContext.refresh();
        DispatcherServlet servlet = new DispatcherServlet(springContext); // register the Spring Dispatcher Servlet
        Tomcat.addServlet(webContext, "dispatcher", servlet).setLoadOnStartup(1);
        webContext.addServletMappingDecoded("/", "dispatcher"); // map all requests to the dispatcher servlet
        try {
            tomcat.start();
            tomcat.getServer().await(); // run until interrupted by CTRL-C (Unix) , CTRL-D (windows)
        } catch (LifecycleException e) {
            throw new RuntimeException(e);
        }
    }
}
