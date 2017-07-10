package com.migu;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/7/10.
 * 数据库实体类
 */
@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Integer id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "age")
    private Integer age;

    public Test(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Test() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
