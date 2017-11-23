package com.jerome.lombok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author jeromejiang
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:/spring.xml");
        LombokTest lombokTest = applicationContext.getBean(LombokTest.class);
        lombokTest.test();
    }
}
