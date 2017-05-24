package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by Administrator on 2017/5/23.
 */
public class SessionFactoryUtil {

    private static SessionFactory sessionFactory;
    private static Transaction transaction;
    private static Session session;


    public static Session openSession(SessionFactory sessionFactory1) {
        if (sessionFactory == null) {
            buildSessionFactory(sessionFactory1);
        }
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        return session;     //先开启一个事务
    }


    public static SessionFactory buildSessionFactory(SessionFactory sessionFactory1) {
        if (sessionFactory == null) {
            sessionFactory = sessionFactory1;
        }
        return sessionFactory;
    }

    public static void closeSession() {
        if (transaction != null) {
            transaction.commit();
        }
        if (session != null) {
            session.close();
        }
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

}
