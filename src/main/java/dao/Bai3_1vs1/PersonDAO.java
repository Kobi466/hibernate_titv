package dao.Bai3_1vs1;

import dao.DAO;
import model.Bai3_1vs1.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO implements DAO<Person> {
    @Override
    public List<Person> selectAll() {
        List<Person> persons = new ArrayList<>();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                persons = session.createQuery("from Person").getResultList();
                transaction.commit();
                session.close();
            }
        } catch (Exception e) {
            System.out.println("Loi");
        }
        return persons;
    }

    @Override
    public Person selectById(Person person) {
        return null;
    }


    @Override
    public boolean insert(Person person) {
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(person);
                transaction.commit();
                session.close();
                System.out.println("Da them thanh cong");
                return true;
            }
        } catch (Exception e) {
            System.out.println("Loi");
        }
        return false;
    }

    @Override
    public boolean update(Person person) {
        return false;
    }

    @Override
    public boolean delete(Person person) {
        return false;
    }
}
