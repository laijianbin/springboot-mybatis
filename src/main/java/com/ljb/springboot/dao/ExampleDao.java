package com.ljb.springboot.dao;

import com.ljb.springboot.Entity.RelationResult;
import com.ljb.springboot.Entity.Student;

import java.util.List;

public interface ExampleDao {

    public Student findById(int id);
    public List<Student> findByIds(List<Integer> ids);
    public List<RelationResult> relationQuery();
}
