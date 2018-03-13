/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.jaxrs.dao.impl;

import com.amar.jaxrs.dao.StudentDAO;
import com.amar.jaxrs.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amar
 */
public class StudentDAOImpl implements StudentDAO {

    @Override
    public List<Student> getAll() {
        List<Student> list= new ArrayList<>();
        list.add(new Student(1, "amar", "shrestha","amar@gmail.com ", true));
        list.add(new Student(2, "sagar", "shrestha","sagar@gmail.com ", true));
        return list;
    }

    @Override
    public Student getById(int id) {
       for(Student s:getAll()){
           if(s.getId()==id){
               return s;
           }
       }
       
       return null;
    }
    
}
