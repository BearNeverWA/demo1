package com.migu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/7/10.
 */
@RestController
@RequestMapping(value = "/queryTest")
public class TestController {

    @Autowired
    TestQueryService testQueryService;

    @RequestMapping("/findTestNoQuery")
    public Page<Test> findTestNoQuery(Integer page, Integer size){
        Page<Test> datas=testQueryService.findTestNoCriteria(page,size);
        return datas;
    }
}
