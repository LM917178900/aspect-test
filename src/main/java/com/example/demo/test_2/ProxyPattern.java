package com.example.demo.test_2;

/**
 * @description: 代理模式——静态代理；能够看到委托对象和代理对象；
 * @author: leiming5
 * @date: 2020-10-27 17:32
 */
public class ProxyPattern {

    public static void main(String[] args) {
        ITalk people = new People("李明","18");

        // no proxy
        people.talk("no proxy test");
        System.out.println("----------------------------------------->");

        // proxy
        TalkProxy talkProxy = new TalkProxy(people);
        talkProxy.talk("proxy test", "歌唱祖国！");

    }
}
