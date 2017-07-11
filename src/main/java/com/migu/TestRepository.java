package com.migu;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/7/10.
 */
@Repository("testRepository")
public interface TestRepository extends JpaRepository<Test,Integer>{

    @Query("select t from Test t")
    Page<Test> findAll(Pageable pageable);
}
