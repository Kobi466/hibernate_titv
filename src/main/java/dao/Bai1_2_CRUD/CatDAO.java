package dao.Bai1_2_CRUD;

import dao.DAO;
import jakarta.persistence.Query;
import model.Bai1_2_CRUD.Cat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class CatDAO implements DAO<Cat> {
    @Override
    public List<Cat> selectAll() {
        List<Cat> list = new ArrayList<Cat>();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                //Thuc thi cau lenh hql
                String hql = "from Cat";
                Query query = session.createQuery(hql);
                list = query.getResultList();
                transaction.commit();
                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Cat selectById(Cat cat) {
        List<Cat> list = new ArrayList<>();
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                String hql = "from Cat c where c.id=:id";
                Query query = session.createQuery(hql);
                query.setParameter("id", cat.getId());
                list = query.getResultList();
                transaction.commit();
                session.close();
            }
        }catch(Exception e){
            System.out.println("Exception in selectById");
        }
        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public boolean insert(Cat cat) {
        return saveOrUpdate(cat);
    }
    private boolean saveOrUpdate(Cat cat) {
        boolean result = false;
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                //Chi luu khi chua ton tai
//                session.save(cat);
                //Them moi khi chua ton tai, cap nhap du lieu khi da ton tai
                session.saveOrUpdate(cat);
                transaction.commit();
                session.close();
                System.out.println("Successful");
                return true;
            }
        } catch (Exception e) {
            System.out.println("Exception in insert");
        }
        return false;
    }

    @Override
    public boolean update(Cat cat) {
        return saveOrUpdate(cat);
    }

    @Override
    public boolean delete(Cat cat) {
        boolean result = false;
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if(sessionFactory!=null){
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                session.delete(cat);
                transaction.commit();
                session.close();
                System.out.println("Successful");
                return true;
            }
        }catch(Exception e){
            System.out.println("Loi");
        }
        return false;
    }
}
