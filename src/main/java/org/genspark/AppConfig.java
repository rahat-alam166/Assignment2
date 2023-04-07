package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig
{
    @Bean
    public Phone getPhone()
    {
        return new Phone("088-888-8880");
    }
    @Bean
    public Address getAdd()
    {
        return new Address("Dallas", "TX", "USA", "78441");
    }
    @Bean
    public Student getStud()
    {
        List<Phone> temp = new ArrayList<>();
        temp.add(getPhone());
        temp.add(getPhone());
        temp.add(getPhone());
        return new Student(0, "John Smith", temp, getAdd());
    }
}
