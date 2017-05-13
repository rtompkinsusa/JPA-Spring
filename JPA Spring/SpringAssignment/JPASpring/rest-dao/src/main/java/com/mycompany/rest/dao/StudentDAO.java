
package com.mycompany.rest.dao;

import com.mycompany.rest.dao.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import static org.eclipse.persistence.config.ExclusiveConnectionMode.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



@Component
public class StudentDAO {
     // Injected database connection:
    @PersistenceContext()
    private EntityManager em;
 
    // Stores a new guest:
    @Transactional
    public void persist(Student student) {
        em.persist(student);
    }
 
    // Retrieves all the guests:
    public List<Student> getAllStudents() {

        TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s ORDER BY s.id", Student.class);
        return query.getResultList();
    
    }
    
    
}
