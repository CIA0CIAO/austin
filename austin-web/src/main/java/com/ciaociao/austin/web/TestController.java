package com.ciaociao.austin.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ciaociao
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    private String test() {
        return "test";
    }
}
