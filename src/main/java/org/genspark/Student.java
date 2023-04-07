package org.genspark;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class Student
{
    private int student;
    private String name;
    private List<Phone> ph;

    private Address add;
    //comment
    public Student()
    {

    }

    public Student(int student, String name, List<Phone> ph, Address add)
    {
        this.student = student;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "student=" + student +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}
