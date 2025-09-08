# DAT250 H25 - Lecture 07 - Enterprise Applications

Repository for the examples from lecture 07 ("Enterprise Software Application") 
the DAT250 course at HVL in the fall of 2025.

The purpose of this code is to provide a minimal-ish example
on how to use:
- The _Gradle_ build tool,
- _GitHub Actions_ as a CI-server
- and _Spring_ as a Dependency Injection Framework.

Have a look a [`AppConfig`](app/src/main/java/no/hvl/dat250/lecture07/AppConfig.java) and [`App`](app/src/main/java/no/hvl/dat250/lecture07/App.java)
in order to learn how to configure Dependency Injection with Spring.
Feel free to replace the implementation of the `CalculatorInterface`.

## Further reading / learning

### Spring Boot

In the lecture, I did not have enough time to demonstrate how
you can recreate the Spring Boot functionality by manually starting 
and embedded Tomcat web server and configuring the Spring Web MVC `DispatcherServlet`.
If you are interested: Have a look at [`WebApp`](app/src/main/java/no/hvl/dat250/lecture07/web/WebApp.java)
and replace the `mainClass` for the application run configuration in the [`build.gradle.kts`](app/build.gradle.kts).
Test if everything works by sending a request to
```http request
GET 127.0.0.1:8080/hi
```

### Documentation 

You can read more in-depth information about today's tools here:

#### Gradle

- [Gradle Folder Structure](https://docs.gradle.org/current/userguide/gradle_directories.html)
- [Gradle Task System](https://docs.gradle.org/current/userguide/tutorial_using_tasks.html)
- [Gradle Java Plugin](https://docs.gradle.org/current/userguide/building_java_projects.html)

#### GH Actions

- [Quickstart](https://docs.github.com/en/actions/get-started/quickstart)
- [Reference](https://docs.github.com/en/actions/reference/workflows-and-actions/workflow-syntax)
- [GH Action Marketplace: Checkout](https://github.com/marketplace/actions/checkout)
- [GH Action Marketplace: Java Setup](https://github.com/marketplace/actions/setup-java-jdk)

#### Spring

- [Dependency Injection Configuration Container](https://docs.spring.io/spring-framework/reference/core/beans/introduction.html)
- [Spring Annotation Config](https://docs.spring.io/spring-framework/reference/core/beans/annotation-config.html)
- [Spring Web MVC Configuration](https://docs.enterprise.spring.io/spring-framework/reference/web/webmvc/mvc-servlet.html)


