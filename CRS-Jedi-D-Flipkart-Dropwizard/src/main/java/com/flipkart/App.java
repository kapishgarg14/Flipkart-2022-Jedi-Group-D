package com.flipkart;

import com.flipkart.rest.AdminRestAPI;
import com.flipkart.rest.ProfessorRestAPI;
import com.flipkart.rest.StudentRestAPI;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App extends io.dropwizard.Application<Configuration> {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void run(Configuration c, Environment e) throws Exception {
        LOGGER.info("Registering REST resources");
        System.out.println("Hello world run");
        final StudentRestAPI studentRestAPI = new StudentRestAPI();
        e.jersey().register(studentRestAPI);
        final ProfessorRestAPI professorRestAPI = new ProfessorRestAPI();
        e.jersey().register(professorRestAPI);
        final AdminRestAPI adminRestAPI = new AdminRestAPI();
        e.jersey().register(adminRestAPI);
    }

    public static void main(String[] args) throws Exception {
        new App().run(args);
        System.out.println("Inside App");
        System.out.println("Hello World!");
    }

}
