package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student obj = (Student) context.getBean(Student.class);
        System.out.println(obj);
    }
}