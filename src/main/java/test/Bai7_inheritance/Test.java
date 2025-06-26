package test.Bai7_inheritance;

import model.Bai7_inheritance.GiaoVien;
import model.Bai7_inheritance.SinhVien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.sql.Date;

public class Test {
    public static void main(String[] args) {
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if(sessionFactory != null){
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                GiaoVien giaoVien = new GiaoVien("G1", "Tan Loi", new Date(2006, 06, 04), "Mon Hibernate");
                SinhVien sinhVien = new SinhVien("S1", "Kobi", new Date(2006, 9, 28), 8.0);
                session.save(giaoVien);
                session.save(sinhVien);
                transaction.commit();
                session.close();
            }
        }catch(Exception e){
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
