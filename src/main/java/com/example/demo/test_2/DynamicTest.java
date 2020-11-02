package com.example.demo.test_2;

/**
 * @description: 代理模式——java动态代理；代理的是接口
 * 使用JDK动态代理，如果被代理的目标实现了至少一个接口，则会使用JDK动态代理，所有该目标类型实现的接口都将被代理。
 * @refer: https://blog.csdn.net/pwc1996/article/details/48103953
 * @author: leiming5
 * @date: 2020-10-28 10:41
 */
public class DynamicTest {

    public static void main(String[] args) {
        ITalk iTalk =   (ITalk) new DynamicProxy().bind(new People("李明","18"));

        iTalk.talk("today is a good day");
    }
}
