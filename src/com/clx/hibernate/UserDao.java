package com.clx.hibernate;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Map;

/**
 * Created by ur15975@outlook.com on 2017/6/19.
 */
public class UserDao {

    public static void main(String[] args) {
        haveFun();
        System.exit(0);
    }

    //向表中插入User
    public static int insert(User user) {
        int i = 0;
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            i = (Integer) session.save(user);
            transaction.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }

        System.out.println(user.getName());
        return i;
    }

    //根据Id删除对应用户
    public static int delete(int id) {
        int i = 0;
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            User user = session.load(User.class, id);
            session.delete(user);
            i = 1;
            transaction.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }

        return i;
    }

    //根据ID修改用户信息
    public static int alter(int id, String name, String password, String email) {
        int i = 0;
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            User user = session.load(User.class, id);
            user.setName(name);
            user.setPassword(password);
            user.setEmail(email);

            session.update(user);
            i = 1;
            transaction.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
        return i;
    }

    //根据ID查找用户
    public static List selectById(int id) {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            Query query = session.createQuery("from User where id = " + id);
            List list = query.list();
            transaction.commit();
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
        return null;
    }

    //根据姓名查找用户
    public static List selectByName(String name) {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            Query query = session.createQuery("from User where name = \'" +  name + "\'");
            List list = query.list();
            transaction.commit();
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
        return null;
    }

    //根据邮箱查找用户
    public static List selectByEmail(String email) {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            Query query = session.createQuery("from User where email = \'" +  email + "\'");
            List list = query.list();
            transaction.commit();
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
        return null;
    }

    //查找全部用户
    public static List selectAll() {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            Query query = session.createQuery("from User");
            List list = query.list();
            transaction.commit();
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
        return null;
    }

    public static String haveFun() {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
//            Query query = session.createQuery("select count (id) from User ");
//            query.setParameter(0, "us1549");
//            query.setParameter(1, "1234dfsa654");

//            删除
//            String hql = "delete from User where id = ?";
//            Query query = session.createQuery(hql);
//            query.setParameter(0, 5);
//            int rowCount = query.executeUpdate();
//            System.out.println(rowCount);

            //多重select返回Object[](数组)
//            String hql = "select firstName,lastName,id from TbEmployee ";
            //也可以new list返回List
//            String hql = "select new list (firstName,lastName,id) from TbEmployee ";
            //也可以new map返回Map
//            String hql = "select new map (firstName,lastName) from TbEmployee ";
//            Query query = session.createQuery(hql);
//            transaction.commit();
//
//            List<Object[]> list = query.list();
//            for (Object[]  tbEmployee : list) {
//                System.out.println(tbEmployee[0]);
//                System.out.println(tbEmployee[1]);
//                System.out.println(tbEmployee[2]);
//            }

            String hql = "from User where id > 0";
            Query query = session.createQuery(hql);
            transaction.commit();

            List<User> list = query.list();
            for (User user : list) {
                System.out.println(user.getName());
                System.out.println(user.getEmail());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
        return null;
    }

    //获取SessionFactory工厂
    private static SessionFactory getSessionFactory() {
        // 但在5.1.0版本汇总，hibernate则采用如下新方式获取：
        // 1. 配置类型安全的准服务注册类，这是当前应用的单例对象，不作修改，所以声明为final
        // 在configure("cfg/hibernate.cfg.xml")方法中，如果不指定资源路径，默认在类路径下寻找名为hibernate.cfg.xml的文件
        final StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                        .configure("hibernate.cfg.xml")
                        .build();
        // 2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
        return new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
    }

//    获取Session的另外一种方法
//    Session session=new Configuration()
//            .configure("hibernate.cfg.xml")
//            .buildSessionFactory()
//            .openSession();
}
