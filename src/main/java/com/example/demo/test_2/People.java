package com.example.demo.test_2;

/**
 * @description: People
 * @author: leiming5
 * @date: 2020-10-27 17:24
 */
public class People implements ITalk {
    private String name;
    private String age;

    public People() {
    }

    public People(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void talk(String message) {
        System.out.println("你好，我的名字是："+ name+"，我的年龄是：" + age + ", "+message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
