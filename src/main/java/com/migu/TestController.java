package com.migu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/10.
 */
@Controller
@RequestMapping(value = "/queryTest")
public class TestController {

    @Autowired
    TestQueryService testQueryService;

    @RequestMapping("/findTestNoQuery")
    public String findTestNoQuery(ModelMap modelMap, @RequestParam(value = "page",defaultValue = "0")Integer page,@RequestParam(value = "size",defaultValue = "1")Integer size){
        Page<Test> datas=testQueryService.findTestNoCriteria(page,size);
        modelMap.addAttribute("datas",datas);
        return "index1";
    }
}
