package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Spring.xml");
        ApplicationContextAwareTest appcontext= (ApplicationContextAwareTest)context.getBean("contextAware");
        ApplicationContext appCon =appcontext.getContext();
        Main a= (Main) appCon.getBean("main");
        a.doTask();
        context.registerShutdownHook();
    }
}
