package org.example;

import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Person person1 = new Person("Test1", 20);
//            Person person2 = new Person("Test2", 30);
//            Person person3 = new Person("Test3", 40);
//
//            session.save(person1);
//            session.save(person2);
//            session.save(person3);

//            List<Person> people = session.createQuery("from Person where age > 30").getResultList();
//            List<Person> people = session.createQuery("from Person where name like 'T%'").getResultList();
//            session.createQuery("update Person set name='T%' where age < 30").executeUpdate();
            session.createQuery("delete from Person where age < 30").executeUpdate();

//            for (Person person :
//                    people) {
//                System.out.println(person);
//            }



            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
