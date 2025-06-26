package test.Bai9_Lazy_Eager;

import model.Bai9_Lazy_Eager.ChiTietDonHang;
import model.Bai9_Lazy_Eager.DonHang;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


import java.util.List;

public class Test {
    public static void main(String[] args) {
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if(sessionFactory != null){
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();

//                DonHang donHang = new DonHang();
//                donHang.setNgayMuaHang(new Date(System.currentTimeMillis()));
//                donHang.setTenKhachHang("Loi Kobi");
//                session.save(donHang);
//                for (int i = 0; i < 100; i++) {
//                    ChiTietDonHang ct = new ChiTietDonHang("Ao thun", i, 50000, 5000*i, donHang);
//                    session.saveOrUpdate(ct);
//                }
                long batDau = System.currentTimeMillis();
                DonHang donHang = session.get(DonHang.class, 15);
                List<ChiTietDonHang> listDonHang = donHang.getDanhSachChiTietDonHang();
                for (ChiTietDonHang chi : listDonHang) {
                    System.out.println(chi);
                }
                System.out.println(donHang);
                long ketThuc = System.currentTimeMillis();
                System.out.println("Thoi gian thuc hien: "+(batDau-ketThuc));

                transaction.commit();
                session.close();
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
