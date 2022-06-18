package com.flipkart.rest;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.flipkart.bean.*;
import com.flipkart.dao.ProfessorDaoImplementation;
import com.flipkart.dao.ProfessorDaoInterface;
import com.flipkart.dao.StudentDaoImplementation;
import com.flipkart.exception.ProfessorNotFoundException;
import com.flipkart.service.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

@Path("/professor")
@Produces(MediaType.APPLICATION_JSON)
public class ProfessorRestAPI {

    Professor professor;

    @GET
    @Path("/{userID}/{userPassword}")
    @Consumes("application/json")
    public Response loginStudents(@PathParam("userID") String userID, @PathParam("userPassword") String userPassword) {

        ProfessorService profServ = new ProfessorService();
        this.professor = profServ.validateCredentials(userID, userPassword);

        return Response.status(201).entity("Logged in").build();

    }

    @GET
    @Path("/data")
    @Consumes("application/json")
    public Response viewProf() {
        try{
//            ProfessorService profServ = new ProfessorService();
//            ProfessorDaoInterface profServ = new ProfessorDaoImplementation();
//            Professor professor = profServ.validateCredentials(id, password);
//            ProfessorDaoInterface profServShow = new ProfessorDaoImplementation();
//            Map<String,ArrayList<String>> courseWithStudents=profServShow.viewEnrolledStudentsWithDB(professor);
//            if (courseWithStudents.size()==0) {
//                return Response.status(201).entity("No Students To Show").build();
//            }
            return Response.status(201).entity(professor).build();
        }
        catch(Exception E){
            return Response.status(201).entity("Some Exception Occured !! check logs").build();
        }

    }
    @GET
    @Path("/getCourses")
    @Consumes("application/json")
    public Response viewCourses() throws SQLException {
        try {
            ProfessorDaoInterface profDAOInterface = new ProfessorDaoImplementation();
            ArrayList<Course> courses = profDAOInterface.viewCoursesWithDB();

//            ProfessorService profServ = new ProfessorService();
//            ArrayList<Course> courses = profServ.viewAllCourses();
//            if (courses == null)
//                return Response.status(201).entity("No Courses to Show").build();
            return Response.status(201).entity(courses).build();

        }catch (Exception e) {
            return Response.status(201).entity("Some Exception Occured !! check logs").build();
        }
    }

    @PUT
    @Path("/registerCourses/")
    @Consumes("application/json")
    public Response registerCourses() throws SQLException{
        try{
            ProfessorService profServ = new ProfessorService();
            profServ.registerCourses(professor);
        }
        catch(Exception E){
            return Response.status(201).entity("Some Exception Occured !! check logs").build();
        }
        return Response.status(201).entity("Courses Registered").build();
    }

    @PUT
    @Path("/assignGrades")
    @Consumes("application/json")
    public Response assignGrades(){
        try{
            ProfessorService profServ = new ProfessorService();
            profServ.assignGrades(professor);
        }
        catch(Exception E){
            return Response.status(201).entity("Some Exception Occured !! check logs").build();
        }
        return Response.status(201).entity("Grades Assigned").build();
    }

    @GET
    @Path("/availableCourses")
    @Consumes("application/json")
    public Response viewEnrolledStudents() {
        try{
//            ProfessorService profServ = new ProfessorService();
//            ProfessorDaoInterface profServ = new ProfessorDaoImplementation();
//            Professor professor = profServ.validateCredentials(id, password);
            ProfessorDaoInterface profServShow = new ProfessorDaoImplementation();
            Map<String,ArrayList<String>> courseWithStudents=profServShow.viewEnrolledStudentsWithDB(professor);
            if (courseWithStudents.size()==0) {
                return Response.status(201).entity("No Students To Show").build();
            }
            return Response.status(201).entity(courseWithStudents).build();
        }
        catch(Exception E){
            return Response.status(201).entity("Some Exception Occured !! check logs").build();
        }

    }
}
