package com.migu.Controller;

import com.migu.Entity.Test;
import com.migu.Service.TestQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/10.
 */
@RestController
@RequestMapping(value = "/queryTest")
public class TestController {

    @Autowired
    TestQueryService testQueryService;

    //访问地址http://localhost:8081/queryTest/findTestNoQuery?page=xxx&size=xxx
    @RequestMapping("/findTestNoQuery")
    public Page<Test> findTestNoQuery(Integer page, Integer size) {
        return testQueryService.findTestNoCriteria(page,size);
    }
}
