package test.Bai5_1vsn;

import model.Bai5_1vsn.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            if (sf != null) {
                Session session = sf.openSession();
                Transaction tx = session.beginTransaction();

//                Customer c1 = new Customer("001", "Loi", "loi@gmail.com");
//                Oder o1 = new Oder("H001", "BINH DINH", c1);
//                Oder o2 = new Oder("H002", "DA NANG", c1);
//                Oder o3 = new Oder("H003", "TPHCM", c1);
//                Oder o4 = new Oder("H004", "QUANG NGAI", c1);
//                Oder o5 = new Oder("H005", "BINH DINH", c1);
//                List<Oder> list = new ArrayList<Oder>();
//                list.add(o1);
//                list.add(o2);
//                list.add(o3);
//                list.add(o4);
//                list.add(o5);
//                c1.setOders(list);
//                session.saveOrUpdate(c1);
//                session.saveOrUpdate(o1);
//                session.saveOrUpdate(o2);
//                session.saveOrUpdate(o3);
//                session.saveOrUpdate(o4);
//                session.saveOrUpdate(o5);
//                Customer c2 = new Customer("003", "Kobi", "loiKobi@gmail.com");
//                session.save(c2);
                String hql = "from Customer c where size(c.oders) > 0";
                List<Customer> result = session.createQuery(hql).list();
                for (Customer c : result) {
                    System.out.println(c);
                }
                tx.commit();
                session.close();
            }
        } catch (Exception e) {
            System.out.println("Loi");
        }
    }
}
