package com.vtnc.rest.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vtnc.rest.model.Student;
import com.vtnc.rest.storage.StudentStorage;

@Path("/students")
public class StudentService {

    // URI:
    // /contextPath/servletPath/Students
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Student> getStudents_JSON() {
        List<Student> listOfStudent = StudentStorage.getAllStudents();
        return listOfStudent;
    }

    // URI:
    // /contextPath/servletPath/Students/{code}
    @GET
    @Path("/{code}")
    @Produces({ MediaType.APPLICATION_XML })
    public Student getStudent(@PathParam("code") String code) {
        Student student = StudentStorage.getStudent(code);
        return student;
    }

    // URI:
    // /contextPath/servletPath/Students
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Student> addStudent(Student student) {
        StudentStorage.addStudent(student);
        List<Student> listOfStudent = StudentStorage.getAllStudents();
        return listOfStudent;
    }

    // URI:
    // /contextPath/servletPath/Students
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Student> updateStudent(Student student) {
        StudentStorage.updateStudent(student);
        List<Student> listOfStudent = StudentStorage.getAllStudents();
        return listOfStudent;
    }

    @DELETE
    @Path("/{code}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Student> deleteStudent(@PathParam("code") String code) {
        StudentStorage.deleteStudent(code);
        List<Student> listOfStudent = StudentStorage.getAllStudents();
        return listOfStudent;
    }

}