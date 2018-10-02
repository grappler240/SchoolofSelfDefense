package controllers;

import com.amazonaws.services.dynamodbv2.xspec.S;
import models.*;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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

    public Result getStudentName()
    {


        return ok(views.html.mainpage.render());

    }

    public Result getStudentDetails()
    {
        return ok(views.html.mainpage.render());

    }

    @Transactional
    public Result searchByName()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        String lastname = form.get("searchlastname");
        //                                                  String,      String,         String,       String,     String,      String,     String,        String,         String,           int,              int,          boolean,   java.math.BigDecimal, java.time.LocalDate
        String SQL = "SELECT NEW models.SearchStudents (s.lastName, s. firstName, s.studentAddress, s.cityName, l.stateName, s.zipCode, s.phoneNumber, s.beltRank, i.instructorName,s.paymentFrequencyId, s.techniqueId, s.contractStatus, s.rate, s.startDate) " +
                " FROM Student s JOIN Instructor i ON i.instructorId=s.instructorId " +
                " JOIN State l ON l.stateId = s.stateId " +
                "WHERE lastname = :lastname";


        List<SearchStudents> students = jpaApi.em().createQuery(SQL, SearchStudents.class).setParameter("lastname", lastname).getResultList();
        return ok(views.html.studentdetails.render(students));
    }

    @Transactional
    public Result searchByInstructor()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        String InstructorName = "%";
        InstructorName += form.get("searchInstructor");

        if (InstructorName == null)
        {
            InstructorName = "";
        }

        InstructorName += "%";

        String SQL = "SELECT s " +
                "from Student s " +
                "join Instructor i on s.instructorId = i.instructorId " +
                "WHERE instructorName LIKE :instructorname";

        List<Student> students = jpaApi.em().createQuery(SQL, Student.class).setParameter("instructorname", InstructorName).getResultList();
        return ok(views.html.students.render(students));
    }


    @Transactional
    public Result listStudents()
    {
        DynamicForm form = formFactory.form().bindFromRequest();

        String searchName = form.get("searchname");

        if (searchName == null)
        {
            searchName = "";
        }

        searchName += "%";

        String sql = "SELECT s FROM Student s WHERE lastName LIKE :searchName ORDER BY lastName";

        List<Student> listStudents = jpaApi.em().createQuery(sql, Student.class).setParameter("searchName", searchName).getResultList();

        return ok(views.html.liststudents.render(listStudents));

    }

    @Transactional
    public Result getEditStudent(int studentId)
    {

        String SQL = "SELECT s FROM Student s WHERE studentId = :studentId";
        Student editstudent = jpaApi.em().createQuery(SQL, Student.class).setParameter("studentId", studentId).getSingleResult();

        String stateSQL = "SELECT s FROM State s ";
        List<State> states = jpaApi.em().createQuery(stateSQL, State.class).getResultList();

        String techniqueSQL = "SELECT t FROM Technique t";
        List<Technique> techniques = jpaApi.em().createQuery(techniqueSQL,Technique.class).getResultList();

        String instructorSQL = "SELECT i FROM Instructor i";
        List<Instructor> instructors = jpaApi.em().createQuery(instructorSQL,Instructor.class).getResultList();

        String paymentfrequencySQL = "SELECT p FROM PaymentFrequency p";
        List<PaymentFrequency> payments = jpaApi.em().createQuery(paymentfrequencySQL,PaymentFrequency.class).getResultList();


        String nextStudentIdSQL = "SELECT NEW models.StudentId(MIN(studentId)) FROM Student s WHERE studentId>:studentId";
        StudentId nextStudentId = jpaApi.em().createQuery(nextStudentIdSQL, StudentId.class).setParameter("studentId", studentId).getSingleResult();

        if (nextStudentId.getId() == null)
        {
            String minStudentIdSQL = "SELECT NEW models.StudentId(MIN(studentId)) FROM Student s";
            nextStudentId = jpaApi.em().createQuery(minStudentIdSQL, StudentId.class).getSingleResult();

        }


        String previousStudentIdSQL = "SELECT NEW models.StudentId(MAX(studentId)) FROM Student s WHERE studentId<:studentId";
        StudentId previousStudentId = jpaApi.em().createQuery(previousStudentIdSQL, StudentId.class).setParameter("studentId", studentId).getSingleResult();

        if (previousStudentId.getId() == null)
        {
            String maxStudentIdSQL = "SELECT NEW models.StudentId(MAX(studentId)) FROM Student s";
            previousStudentId = jpaApi.em().createQuery(maxStudentIdSQL, StudentId.class).getSingleResult();

        }


        return ok(views.html.editstudent.render(editstudent, nextStudentId.getId(), previousStudentId.getId(), states, techniques, instructors, payments));


    }
    @Transactional
    public Result postEditStudent(int studentId)
    {

        String studentSQL = "SELECT s FROM Student s WHERE studentId = :studentId";
        Student student = jpaApi.em().createQuery(studentSQL, Student.class).setParameter("studentId", studentId).getSingleResult();



        DynamicForm form = formFactory.form().bindFromRequest();
        String lastName = form.get("lastname");
        String firstName = form.get("firstname");
        String studentAddress = form.get("studentaddress");
        String cityName = form.get("cityname");
        String stateId = form.get("stateId");
        String zipCode = form.get("zipcode");
        String phoneNumber = form.get("phonenumber");
        String beltRank = form.get("beltrank");
        int techniqueId = Integer.parseInt(form.get("techniqueId"));
        Boolean contractStatus = new Boolean (form.get("contractstatus"));
        BigDecimal rate = new BigDecimal(form.get("rate"));
        int instructorId = Integer.parseInt(form.get("instructorId"));
        int paymentFrequencyId = Integer.parseInt(form.get("paymentfrequencyId"));
        LocalDate startDate = LocalDate.parse(form.get("startdate"));



        student.setLastName(lastName);
        student.setFirstName(firstName);
        student.setStudentAddress(studentAddress);
        student.setCityName(cityName);
        student.setStateId(stateId);
        student.setZipCode(zipCode);
        student.setPhoneNumber(phoneNumber);
        student.setBeltRank(beltRank);
        student.setTechniqueId(techniqueId);
        student.setContractStatus(contractStatus);
        student.setRate(rate);
        student.setInstructorId(instructorId);
        student.setPaymentFrequencyId(paymentFrequencyId);
        student.setStartDate(startDate);


        return redirect("/editstudent/" + studentId);


    }
    @Transactional
    public Result getNewStudent ()
    {
        String stateSQL = "SELECT s FROM State s ";
        List<State> states = jpaApi.em().createQuery(stateSQL, State.class).getResultList();

        String instructorSQL = "SELECT i FROM Instructor i";
        List<Instructor> instructors = jpaApi.em().createQuery(instructorSQL,Instructor.class).getResultList();

        String paymentfrequencySQL = "SELECT p FROM PaymentFrequency p";
        List<PaymentFrequency> payments = jpaApi.em().createQuery(paymentfrequencySQL,PaymentFrequency.class).getResultList();

        return ok(views.html.newstudent.render(states, instructors, payments));

    }

    @Transactional
    public Result postNewStudent()
    {
        DynamicForm form = formFactory.form().bindFromRequest();

        String lastName = form.get("lastname");
        String firstName = form.get("firstname");
        String studentAddress = form.get("studentaddress");
        String cityName = form.get("cityname");
        String stateId = form.get("stateId");
        String zipCode = form.get("zipcode");
        String phoneNumber = form.get("phonenumber");
        String beltRank = form.get("beltrank");
        int techniqueId = Integer.parseInt(form.get("techniqueId"));
        Boolean contractStatus = new Boolean (form.get("contractstatus"));
        BigDecimal rate = new BigDecimal(form.get("rate"));
        int InstructorId = Integer.parseInt(form.get("instructorId"));
        int paymentFrequencyId = Integer.parseInt(form.get("paymentfrequencyId"));
        LocalDate startDate = LocalDate.parse(form.get("startdate"));
        String result = new String();

        Student newstudent = new Student();
        newstudent.setLastName(lastName);
        newstudent.setFirstName(firstName);
        newstudent.setStudentAddress(studentAddress);
        newstudent.setCityName(cityName);
        newstudent.setStateId(stateId);
        newstudent.setZipCode(zipCode);
        newstudent.setPhoneNumber(phoneNumber);
        newstudent.setBeltRank(beltRank);
        newstudent.setTechniqueId(techniqueId);
        newstudent.setContractStatus(contractStatus);
        newstudent.setRate(rate);
        newstudent.setInstructorId(InstructorId);
        newstudent.setPaymentFrequencyId(paymentFrequencyId);
        newstudent.setStartDate(startDate);

        jpaApi.em().persist(newstudent);
        result = "saved";
        return redirect("/liststudents");
    }

    @Transactional
    public Result deleteStudent(int studentId)
    {
        String deleteSQL = "SELECT s FROM Student s where studentId = :studentId";

        Student deleteStudent = jpaApi.em().createQuery(deleteSQL, Student.class).setParameter("studentId", studentId).getSingleResult();

        jpaApi.em().remove(deleteStudent);

        return redirect("/liststudents");
    }

    @Transactional
    public Result listTechniques()
    {
        DynamicForm form = formFactory.form().bindFromRequest();

        String searchTechnique= form.get("searchtechnique");

        if (searchTechnique == null)
        {
            searchTechnique = "";
        }

        searchTechnique += "%";

        String sql = "SELECT t FROM Technique t ORDER BY techniqueId";

        List<Technique> listTechniques = jpaApi.em().createQuery(sql, Technique.class).getResultList();

        return ok(views.html.listtechniques.render(listTechniques));

    }


}
