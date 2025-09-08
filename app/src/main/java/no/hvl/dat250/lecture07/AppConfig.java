package no.hvl.dat250.lecture07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // A configuration hosts bean method
@ComponentScan(basePackages = "no.hvl.dat250.lecture07") // Looking for other Configurations and Components in this package
public class AppConfig {

    @Bean // A bean method creates a dependency-managed class
    public CalculationInterface calculateImplementation() {
        return new SubtractCalculator();
    }


}
