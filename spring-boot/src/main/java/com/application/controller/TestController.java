package com.application.controller;

import com.application.entity.HelpKeyword;
import com.application.service.ITestService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping(value = "/querySome",method = RequestMethod.GET)
    public List<HelpKeyword> querySome(){
       List<HelpKeyword> list = testService.querySome();
        return list;
    }
}
