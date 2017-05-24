package dao;

import entity.Students;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import util.SessionFactoryUtil;

import java.util.List;

/**
 * Created by Administrator on 2017/5/23.
 */
@Repository
public class StudentsDao {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public StudentsDao() {

    }

    public void insertStu(Students students) {
        SessionFactoryUtil.openSession(sessionFactory).save(students);

        SessionFactoryUtil.closeSession();
    }

    public List<Students> getAllStudents() {
        String hql = "  from Students"; //查询age的6倍大于18
        Query query = SessionFactoryUtil.openSession(sessionFactory).createQuery(hql);
        List<Students> studentsList = query.list();

        return studentsList;

    }

}
