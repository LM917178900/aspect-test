package com.example.demo.test_3;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: CglibProxy
 * @author: leiming5
 * @date: 2020-10-28 10:54
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * 委托对象
     */
    private Object target;

    /**
     * 创建代理对象
     * @return
     */
    public Object getInstance(Object target){

        this.target = target;
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(this.target.getClass());
        // 回调方法
        enhancer.setCallback(this);

        // 创建代理对象
        return enhancer.create();
    }
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        Object result = null;
        System.out.println("before service");
        //业务代码
        result = methodProxy.invokeSuper(proxy,args);

        System.out.println("after service");

        return result;
    }
}
