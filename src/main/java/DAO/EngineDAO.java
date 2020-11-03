package DAO;

import Utils.HibernateSessionFactoryUtil;
import model.Engine;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EngineDAO {

    public Engine findById(String id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Engine.class, id);
    }

    public void save(Engine engine) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(engine);
        tx1.commit();
        session.close();
    }

    public void update(Engine engine) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(engine);
        tx1.commit();
        session.close();
    }

    public void delete(Engine engine) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(engine);
        tx1.commit();
        session.close();
    }

}
