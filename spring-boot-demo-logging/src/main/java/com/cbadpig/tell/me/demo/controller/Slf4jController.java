package com.cbadpig.tell.me.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Slf4jController {
    //原始用法
    //private final Logger log = LoggerFactory.getLogger(getClass());
    //private static final Logger log = LoggerFactory.getLogger(Slf4jController.class);

    @RequestMapping("/slf4j")
    public String slf4jDemo() {

        log.info("info");
        log.debug("debug");
        log.error("error");
        log.info("slf4j的{}语法是这样{}的","A","B");
        return "slf4jdemo";
    }

}
