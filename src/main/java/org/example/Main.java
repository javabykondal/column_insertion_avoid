package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Transaction tx=null;
        try{
            SessionFactory sessionFactory=HibernateUtil.getHibernateUtil();
            Session session=sessionFactory.openSession();
            tx=session.beginTransaction();
            Customer customer=new Customer("Kondal","kondalu309@gmail.com",773411);
            session.save(customer);
            tx.commit();
            session.close();

        }catch (Exception ex)
        {
            tx.rollback();
            ex.printStackTrace();
        }


        System.out.println("Hello world!");
    }
}