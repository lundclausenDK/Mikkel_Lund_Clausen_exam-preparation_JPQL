package facade;

import entity.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Facade {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
    private EntityManager em = emf.createEntityManager();

    public List<Student> findAllStudents() {
        em.getTransaction().begin();
        
        Query query = em.createQuery("SELECT s FROM Student s");
        List results = query.getResultList();
        
        em.getTransaction().commit();
        
        return results;
    }
    
    public List<Student> findAllAnders() {
        
        em.getTransaction().begin();
        
        Query query = em.createQuery("SELECT s FROM Student s WHERE s.firstname = 'Anders'");
        List results = query.getResultList();
        
        em.getTransaction().commit();
        
        return results;
        
    }

    
    public void close() {
        em.close();
    }

}
