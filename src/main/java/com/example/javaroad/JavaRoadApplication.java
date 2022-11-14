package com.example.javaroad;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaRoadApplication {
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ConstructorBasedInjection constructorBasedInjection = context.getBean(ConstructorBasedInjection.class);
        constructorBasedInjection.processMsg("Hello");
    }

}
