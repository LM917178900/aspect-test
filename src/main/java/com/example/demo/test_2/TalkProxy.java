package com.example.demo.test_2;

/**
 * @description: TalkProxy
 * @author: leiming5
 * @date: 2020-10-27 17:27
 */
public class TalkProxy implements ITalk{

    /**
     * 委托接口
     */
    private ITalk talker;

    /**
     * 创建代理类
     * @param talker
     */
    public TalkProxy(ITalk talker) {
        this.talker = talker;
    }

    @Override
    public void talk(String message) {
        talker.talk(message);
    }

    public  void talk(String msg, String singName){

        System.out.println("before service");

        talker.talk(msg);
        sing(singName);

        System.out.println("after service");
    }

    public void sing(String singName){
        System.out.println("唱歌："+ singName);
    }
}
