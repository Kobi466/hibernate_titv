package test.Bai4_nvs1;

import model.Bai4_nvs1.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction tx = session.beginTransaction();
//                Author author = new Author("001", "Kobi", new Date(System.currentTimeMillis()));
//                Book book1 = new Book("B01", "CON CA", 50000, author);
//                Book book2 = new Book("B02", "CON CAT", 60000, author);
//                Book book3 = new Book("B03", "CON CAC", 70000, author);
//                session.saveOrUpdate(author);
//                session.saveOrUpdate(book1);
//                session.saveOrUpdate(book2);
//                session.saveOrUpdate(book3);
//                Author author = new Author("002", "Tan Loi", new Date(System.currentTimeMillis()));
//                Book book1 = new Book("B04", "Nguyen", 50000, author);
//                Book book2 = new Book("B05", "Tan", 60000, author);
//                Book book3 = new Book("B06", "Loi", 70000, author);
//                session.saveOrUpdate(author);
//                session.saveOrUpdate(book1);
//                session.saveOrUpdate(book2);
//                session.saveOrUpdate(book3);
                Book book = session.get(Book.class, "B01");
                System.out.println("Tac gia cua sach: "+book.getTitle()+" la: "+book.getAuthor().getName());
                tx.commit();
                session.close();
            }
        } catch (Exception e) {
            System.out.println("Loi");
        }
    }
}
