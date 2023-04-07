package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.genspark")
public class AppConfig
{
    @Bean
    public Phone phone()
    {
        return new Phone("088-888-8880");
    }
    @Bean
    public Address address()
    {
        return new Address("Dallas", "TX", "USA", "78441");
    }
    @Bean
    public Student student()
    {
        List<Phone> temp = new ArrayList<>();
        temp.add(phone());
        temp.add(phone());
        temp.add(phone());
        return new Student(0, "John Smith", temp, address());
    }
}
