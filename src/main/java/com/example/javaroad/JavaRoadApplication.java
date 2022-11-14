package com.example.javaroad;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaRoadApplication {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FirstBean bean = (FirstBean) context.getBean("firstBean");
        bean.populateBeans();
        context.close();
    }

}
