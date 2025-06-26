package test.Bai1_2_CRUD;

import model.Bai1_2_CRUD.Cat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class TestCat2 {
    public static void main(String[] args) {
        //Transient
        Cat cat = new Cat("Concac", new java.sql.Date(new java.util.Date().getTime()), true);
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if(sessionFactory!=null){
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                //Persistent
                session.saveOrUpdate(cat);
                transaction.commit();
                //Detached -> Persistent
                session.refresh(cat);
                session.close();
            }
        }catch(Exception e){
            System.out.println("Loi");
        }
        System.out.println(cat);
    }
}
