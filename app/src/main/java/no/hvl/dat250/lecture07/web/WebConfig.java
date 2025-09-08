package no.hvl.dat250.lecture07.web;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "no.hvl.dat250.lecture07.web")
public class WebConfig {
}
