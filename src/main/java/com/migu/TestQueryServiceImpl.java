package com.migu;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/7/10.
 */
@Service(value = "testQueryService")
public class TestQueryServiceImpl implements TestQueryService {

    @Resource
    TestRepository testRepository;

    @Override
    public Page<Test> findTestNoCriteria(Integer page, Integer size) {
        Pageable pageable=new PageRequest(page,size);
        return testRepository.findAll(pageable);
    }
}
