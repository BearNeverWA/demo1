package com.migu;

import org.springframework.data.domain.Page;

/**
 * Created by Administrator on 2017/7/10.
 */
public interface TestQueryService {
    Page<Test> findTestNoCriteria(Integer page,Integer size);
}
