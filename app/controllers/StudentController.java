package controllers;

import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class StudentController extends Controller
{
    private FormFactory formFactory;
    private JPAApi jpaApi;


    @Inject
    public StudentController(FormFactory formFactory, JPAApi jpaApi)
    {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    public Result getStudentName ()
    {


        return ok(views.html.mainpage.render());

    }

    public searchLastName ()
    {
        String SQL = "SELECT * from student"




    }

}
