package service;

import dao.StudentsDao;
import entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/23.
 */
@Service
public class StudentsService {

    @Autowired
    private StudentsDao studentsDao;

    public StudentsService() {

    }

    public StudentsDao getStudentsDao() {
        return studentsDao;
    }

    public void setStudentsDao(StudentsDao studentsDao) {
        this.studentsDao = studentsDao;
    }


    public void insertStu(Students students) {
        studentsDao.insertStu(students);

    }

    public List<Students> getAllStu() {

        return studentsDao.getAllStudents();
    }
}
