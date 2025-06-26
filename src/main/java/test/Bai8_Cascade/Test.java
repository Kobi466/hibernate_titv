package test.Bai8_Cascade;

import model.Bai8_Cascade.ChiTietDonHang;
import model.Bai8_Cascade.DonHang;
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

                DonHang donHang = new DonHang();
                donHang.setNgayMuaHang(new Date(System.currentTimeMillis()));
                donHang.setTenKhachHang("Kobi");

                ChiTietDonHang ct1 = new ChiTietDonHang("Ao thun", 10, 50000, 55000, donHang);
                ChiTietDonHang ct2 = new ChiTietDonHang("Ao thun", 20, 50000, 55000, donHang);
                ChiTietDonHang ct3 = new ChiTietDonHang("Ao thun", 30, 50000, 55000, donHang);
                ChiTietDonHang ct4 = new ChiTietDonHang("Ao thun", 40, 50000, 55000, donHang);
                ChiTietDonHang ct5 = new ChiTietDonHang("Ao thun", 50, 50000, 55000, donHang);
                ChiTietDonHang ct6 = new ChiTietDonHang("Ao thun", 60, 50000, 55000, donHang);
                donHang.addChiTietDonHang(ct1);
                donHang.addChiTietDonHang(ct2);
                donHang.addChiTietDonHang(ct3);
                donHang.addChiTietDonHang(ct4);
                donHang.addChiTietDonHang(ct5);
                donHang.addChiTietDonHang(ct6);
                session.saveOrUpdate(donHang);
                transaction.commit();
                session.close();
            }
        }catch(Exception e){
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
