package com.ciaociao.austin.web;

import com.alibaba.fastjson.JSON;
import com.ciaociao.austin.support.dao.MessageTemplateDao;
import com.ciaociao.austin.support.domain.MessageTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ciaociao
 */
@Slf4j
@RestController
public class TestController {
    @Resource
    private MessageTemplateDao messageTemplateDao;

    @RequestMapping("/test")
    private String test() {
        System.out.println("sout:啊发大水发大水发链接？");
        log.info("log:啊撒旦解放拉萨的？");
        return "test";
    }

    @RequestMapping("/database")
    private String testDataBase() {
        List<MessageTemplate> list = messageTemplateDao.findAllByIsDeletedEquals(0, PageRequest.of(0, 10));
        return JSON.toJSONString(list);
    }
}
