package com.example.demo.test_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: DynamicProxy
 * @author: leiming5
 * @date: 2020-10-27 18:29
 */
public class DynamicProxy  implements InvocationHandler {

    /**
     * 代理对象
     */
    private Object target;

    /**
     * 绑定委托对象，返回代理类
     * @param target
     * @return
     */
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }
    /**
     *  执行代理业务
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        System.out.println("before service");
        //业务代码
        result = method.invoke(target,args);

        System.out.println("after service");

        return result;
    }
}
