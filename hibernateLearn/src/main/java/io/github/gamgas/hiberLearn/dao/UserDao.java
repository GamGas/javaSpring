package io.github.gamgas.hiberLearn.dao;

import io.github.gamgas.hiberLearn.models.Auto;
import io.github.gamgas.hiberLearn.models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import io.github.gamgas.hiberLearn.utils.HibernateSessionFactoryUtil;

import java.util.List;

public class UserDao {
    public User findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }
    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.persist(user); // save() is deprecated
        tx1.commit();
        session.close();
    }

    public void update(User user){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.merge(user); // update() is deprecated
        tx1.commit();
        session.close();
    }

    public void delete(User user){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.remove(user); //delete is deprecated
        tx1.commit();
        session.close();
    }

    public Auto findAutoById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Auto.class, id);
    }

    public List<User> findAll(){
        List<User> users = (List<User>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from User").list();
        return users;
    }
}
