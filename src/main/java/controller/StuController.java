package controller;

import entity.Students;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.StudentsService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/24.
 */
@Controller
public class StuController {

    @Autowired
    private StudentsService studentsService;

    //注入students bean
    @Resource(name = "students")
    private Students students;

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public StuController() {
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }

    public StudentsService getStudentsService() {
        return studentsService;
    }

    public void setStudentsService(StudentsService studentsService) {
        this.studentsService = studentsService;
    }


    @RequestMapping(value = "/login")
    public String login(Model model) {
        model.addAttribute("user", new User());

        return "login";
    }

    @RequestMapping(value = "/addStu")
    public String addStu(User user, Model model) {
        if (user.getUsername().equals("sdongwan") && user.getPassword().equals("sdongwan")) {
            model.addAttribute("student", new Students());
            return "addStu";
        }
        System.out.println(user);
        return "redirect:/login";
    }

    @RequestMapping(value = "/listStu")
    public String listStu(Model model,Students students) {
       if(students!=null){
           studentsService.insertStu(students);
       }
        List<Students> studentsList = studentsService.getAllStu();
        model.addAttribute("students", studentsList);

        for(Students students1:studentsList){
            System.out.println(students1);
        }
        return "listStu";
    }


}
