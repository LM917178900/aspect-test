package com.example.demo.test_3;

/**
 * @description: 代理模式——cglib动态代理;直接代理类；
 * 通过CGLIB来为目标对象创建代理，若该目标对象没有实现任何接口，则创建一个CGLIB代理，创建的代理类是目标类的子类。
 * @author: leiming5
 * @date: 2020-10-28 11:04
 */
public class CglibTest {

    public static void main(String[] args) {
        PeopleTalk peopleTalk = (PeopleTalk) new CglibProxy().getInstance(new PeopleTalk());

        peopleTalk.talk("今天天气不错！");

        peopleTalk.speak("今天天气不错! +1");
    }
}
