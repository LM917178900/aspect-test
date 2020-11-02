package com.example.demo.asp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: AspectController
 * @author: leiming5
 * @date: 2020-11-02 14:43
 */
@RestController
public class AspectController {

    @Resource
    private Sing sing;

    @GetMapping("aspecttest")
    public String joinAPerformance(@RequestParam("theme") String theme) throws Exception {

        System.out.println(theme);
        sing.perform();

        return theme;
    }
}
