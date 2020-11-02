package com.example.demo.asp;

import org.springframework.stereotype.Service;

/**
 * @description: Sing
 * @author: leiming5
 * @date: 2020-11-02 14:42
 */
@Service
public class Sing implements Performance {
    @Override
    public void perform() throws Exception {
        System.out.println(" this is a good singer,and this is a good sing!");
        throw new Exception("ccc");
    }
}
