/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.jaxrs.dao;

import com.amar.jaxrs.entity.Student;
import java.util.List;

/**
 *
 * @author amar
 */
public interface StudentDAO {
    
    List<Student> getAll();
    Student getById(int id);
}
