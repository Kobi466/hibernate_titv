package test.Bai6_nvsn;

import model.Bai6_nvsn.CuocHop;
import model.Bai6_nvsn.NhanVien;
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
                Transaction tx = session.beginTransaction();
//                NhanVien nv1 = new NhanVien("L01", "Tan Loi", new Date(2006- 1900, 06- 1, 04));
                NhanVien nv1 = new NhanVien("L02", "Kobi", new Date(2006- 1900, 06- 1, 04));
////                session.saveOrUpdate(nv1);
                CuocHop cuocHop = session.find(CuocHop.class, "001");
                cuocHop.addNhanVien(nv1);
                session.save(cuocHop);
                tx.commit();
                session.close();
            }
        }catch(Exception e){
            System.out.println("Loi");
        }
    }
}
