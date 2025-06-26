package test.Bai3_1vs1;

import dao.Bai3_1vs1.PersonDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class TestPerson {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
//        personDAO.insert(new Person("Chong", null));
//        Person p1 = new Person("Chong", null);
//        try {
//            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//            if (sessionFactory != null) {
//                Session session = sessionFactory.openSession();
//                Transaction transaction = session.beginTransaction();
////                Person personChong = session.find(Person.class, 1);
////                Person personVo = new Person("Vo", personChong);
////                session.save(personVo);
//                Person p1 = session.get(Person.class, 1);
//                Person p2 = session.get(Person.class, 2);
//                p1.setRelationship(p2);
//                session.save(p1);
//                transaction.commit();
//                session.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        List<Person> list = personDAO.selectAll();
//        for (Person person : list) {
//            System.out.println(person);
//        }
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                String hql = "SELECT p.name, p.relationship.name FROM Person p";
                List<Object[]> result = session.createQuery(hql).list();
                for (Object[] objects : result) {
                    String name = objects[0]+"";
                    String relationship = objects[1]+"";
                    System.out.println(name + " da ket hon " + relationship);
                }

                transaction.commit();
                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
