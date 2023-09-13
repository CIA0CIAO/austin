package com.ciaociao.austin.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ciaociao
 */
@Slf4j
@RestController
public class TestController {

    @RequestMapping("/test")
    private String test() {
        System.out.println("sout:啊发大水发大水发链接？");
        log.info("log:啊撒旦解放拉萨的？");
        return "test";
    }
}
