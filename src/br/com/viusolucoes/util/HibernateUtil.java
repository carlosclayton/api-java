/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.viusolucoes.util;

import br.com.viusolucoes.model.Categorias;
import br.com.viusolucoes.model.Livros;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author CARLOS CLAYTON
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {                                
                AnnotationConfiguration ac  =   new AnnotationConfiguration();
                
                // Implementando a persistencia usando entidades
                ac.addAnnotatedClass(Categorias.class);
                ac.addAnnotatedClass(Livros.class);
                
                
                sessionFactory = ac.configure().buildSessionFactory();
            } catch (Throwable ex) {
                // Log the exception. 
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
            return sessionFactory;
        } else {
            return sessionFactory;
        }
    }
}
