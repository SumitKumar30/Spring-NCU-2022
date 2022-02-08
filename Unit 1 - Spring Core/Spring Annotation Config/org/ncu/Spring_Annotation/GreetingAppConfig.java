package org.ncu.Spring_Annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.ncu.Spring_Annotation")
@PropertySource("classpath:field.properties")
public class GreetingAppConfig {

}
