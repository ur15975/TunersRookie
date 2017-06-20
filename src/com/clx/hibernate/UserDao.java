package com.clx.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by ur15975@outlook.com on 2017/6/19.
 */
public class UserDao {
    public static int insert(User user) {
        int i = 0;
        SessionFactory sessionFactory = getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        i = (Integer) session.save(user);
        transaction.commit();
        session.close();

        System.out.println(user.getName());
        return i;
    }

    public static List select(int id) {
        int i = 0;
        SessionFactory sessionFactory = getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from User where id = " + id);
        List list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

    public static List selectByName(String name) {
        int i = 0;
        SessionFactory sessionFactory = getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from User where name = \'" +  name + "\'");
        List list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

    public static List selectByEmail(String email) {
        int i = 0;
        SessionFactory sessionFactory = getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from User where email = \'" +  email + "\'");
        List list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

    public static List selectAll() {
        SessionFactory sessionFactory = getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from User");
        List list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

    public static int delete(int id) {
        int i = 0;
        SessionFactory sessionFactory = getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = session.load(User.class, id);
        session.delete(user);
        i = 1;
        transaction.commit();
        System.out.println(user.getId());
        session.close();
        return i;
    }

    public static int alter(int id, String name, String password, String email) {
        int i = 0;
        SessionFactory sessionFactory = getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        Query query = session.createQuery("from User where name = 'fadsafsd'");
//        List list = query.list();
//        for (Object attr:list) {
//            User user = (User) attr;
//            System.out.println(user.getName());
//            System.out.println(user.getPassword());
//            System.out.println(user.getEmail());
//        }

        User user = session.load(User.class, id);

        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);

        session.update(user);
        i = 1;
        transaction.commit();
        session.close();
        return i;
    }

    private static SessionFactory getSessionFactory() {
        final StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                        .configure("hibernate.cfg.xml")
                        .build();
        return new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
    }
}
