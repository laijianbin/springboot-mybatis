package com.ljb.springboot.controller;

import com.ljb.springboot.Entity.RelationResult;
import com.ljb.springboot.Entity.Student;
import com.ljb.springboot.dao.ExampleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/example")
public class ExampleController {

    @Autowired
    ExampleDao dao;
    @RequestMapping(path="/querybyid",method=RequestMethod.GET)
    public Student queryStudentById(int id) {
        return dao.findById(id);
    }

    @RequestMapping(path="/querybyids",method=RequestMethod.POST)
    public List<Student> queryStudentByIds(@RequestBody List<Integer> ids) {
        return dao.findByIds(ids);
    }

    @RequestMapping(path="/querybyrelation",method=RequestMethod.GET)
    public List<RelationResult> relationQuery() {
        return dao.relationQuery();
    }


}


