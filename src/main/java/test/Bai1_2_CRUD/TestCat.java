package test.Bai1_2_CRUD;

import dao.Bai1_2_CRUD.CatDAO;
import model.Bai1_2_CRUD.Cat;

import java.util.List;

public class TestCat {
    public static void main(String[] args) {
//        try{
//            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//            if(sessionFactory != null) {
//                Session session = sessionFactory.openSession();
//                try{
//                    Transaction transaction = session.beginTransaction();
//                    Cat cat1 = new Cat();
//                    cat1.setName("Jerry");
//                    cat1.setSex(false);
//                    session.save(cat1);
//                    transaction.commit();
//                } finally {
//                    session.close();
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        CatDAO catDAO = new CatDAO();
//        Test SellecALL
        List<Cat> list = catDAO.selectAll();
        for (Cat cat : list) {
            System.out.println(cat);
        }
        //Test SellecById
//        Cat cat = new Cat();
//        cat.setCus_id(3);
//        System.out.println(new CatDAO().selectById(cat));
        //Té insert
        Cat cat1 = new Cat("Jerry", new java.sql.Date(new java.util.Date().getTime()), false);
//        catDAO.insert(cat1);
        cat1.setId(6);
//        catDAO.insert(cat1);

        catDAO.delete(cat1);
    }
}
