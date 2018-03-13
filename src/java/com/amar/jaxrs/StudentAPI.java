package com.amar.jaxrs;

import com.amar.jaxrs.dao.StudentDAO;
import com.amar.jaxrs.dao.impl.StudentDAOImpl;
import com.amar.jaxrs.entity.Student;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value= "/studentapi")
public class StudentAPI{
    private StudentDAO stdDAO= new StudentDAOImpl();
    @GET
    public String index(){
        return "Hello ";
    }
   
    @Path (value="/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> list(){
        return stdDAO.getAll();
    }
    
    @Path(value="/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Student byId(@PathParam("id") int id){
        return stdDAO.getById(id);
    }
    
}