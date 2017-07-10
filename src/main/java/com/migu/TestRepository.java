package com.migu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/7/10.
 */
@Repository("testRepository")
public interface TestRepository extends JpaRepository<Test,Integer>{
}
