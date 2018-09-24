package controllers;

import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import javax.inject.Inject;


public class MainController extends Controller
{

    private FormFactory formFactory;
    private JPAApi jpaApi;


    @Inject
    public MainController(FormFactory formFactory, JPAApi jpaApi)
    {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }


    @Transactional
    public Result getMainPage()
    {
        return ok(views.html.mainpage.render());
    }









}
