package com.dumas.sta.detailed.configuration.controller;

import com.dumas.sta.detailed.configuration.config.MyProerties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/02 15:38
 */
@RestController
@RequestMapping("properties")
public class PropertiesController {
    private static final Logger log = LoggerFactory.getLogger(PropertiesController.class);

    private final MyProerties myProerties;

    @Autowired
    public PropertiesController(MyProerties myProerties) {
        this.myProerties = myProerties;
    }

    @GetMapping("/print")
    public MyProerties myProerties() {
        log.info("==============================================");
        log.info(myProerties.toString());
        log.info("==============================================");
        return myProerties;
    }
}
