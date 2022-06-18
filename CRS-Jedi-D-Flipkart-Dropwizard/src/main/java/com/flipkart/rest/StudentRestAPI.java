package com.flipkart.rest;

import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.dao.*;
import com.flipkart.service.ProfessorService;
import com.flipkart.service.StudentInterface;
import com.flipkart.service.StudentOperations;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Map;

@Path("/student")
@Produces(MediaType.APPLICATION_JSON)


public class StudentRestAPI {

    Student student;

    @GET
    @Path("/{userID}/{userPassword}")
    @Consumes("application/json")
    public Response loginStudents(@PathParam("userID") String userID, @PathParam("userPassword") String userPassword) {

        StudentDaoInterface studentDaoImplementation = new StudentDaoImplementation();
        this.student = studentDaoImplementation.validateCredentials(userID, userPassword);


        return Response.status(201).entity("Logged in").build();

    }

    @GET
    @Path("/data")
    @Consumes("application/json")
    public Response getStudents() {
        try{

//        Employee employee = EmployeeDB.getEmployee(id);
            if (student != null)
                return Response.ok(student).build();
            else
                return Response.status(Response.Status.NOT_FOUND).build();
        }
        catch(Exception E){
            return Response.status(201).entity("Some Exception Occured !! check logs").build();
        }

    }

    @GET
    @Path("/feeStatus")
    @Consumes("application/json")
    public Response getFeeStatus() {
        try{
            StudentDaoInterface studentDaoImplementation = new StudentDaoImplementation();
            String resp = studentDaoImplementation.getfeeStatus(this.student.getUserId());
//        Employee employee = EmployeeDB.getEmployee(id);
            return Response.ok(resp).build();
        }
        catch(Exception E){
            return Response.status(201).entity("Some Exception Occured !! check logs").build();
        }

    }

    @PUT
    @Path("/registerCourse")
    @Consumes("application/json")
    public Response registerCourse() {
        try{
            //StudentDaoInterface studentDaoImplementation = new StudentDaoImplementation();
            //String resp = studentDaoImplementation.registerCourses(this.student.getUserId());
            StudentInterface studentInterface = new StudentOperations();
            studentInterface.registerCourses(this.student.getUserId());
//        Employee employee = EmployeeDB.getEmployee(id);
            return Response.ok("Successfully Registered").build();
        }
        catch(Exception E){
            return Response.status(201).entity("Some Exception Occured !! check logs").build();
        }

    }

    @GET
    @Path("/viewRegistered")
    @Consumes("application/json")
    public Response viewRegistered() {
        try{
            StudentInterface studentInterface = new StudentOperations();
            studentInterface.registeredCourseList(this.student.getUserId());
//        Employee employee = EmployeeDB.getEmployee(id);
            return Response.ok("Showed courses").build();
        }
        catch(Exception E){
            return Response.status(201).entity("Some Exception Occured !! check logs").build();
        }

    }

    @PUT
    @Path("/registerStudent")
    @Consumes("application/json")
    public Response registerStudent() {
        try{
            StudentDaoInterface studentDaoImplementation = new StudentDaoImplementation();
            String resp = studentDaoImplementation.addStudent();
//            StudentInterface studentInterface = new StudentOperations();
//            studentInterface.registerCourses(this.student.getUserId());
//        Employee employee = EmployeeDB.getEmployee(id);
            return Response.ok(resp).build();
        }
        catch(Exception E){
            return Response.status(201).entity("Some Exception Occured !! check logs").build();
        }

    }
}
