package com.example.demo.test_4;

/**
 * @description: Teacher
 * @author: leiming5
 * @date: 2020-10-28 11:35
 */
public class Teacher implements People{

    @Override
    public String work() {
        System.out.println("老师教书育人...");
        return "教书";
    }

}
