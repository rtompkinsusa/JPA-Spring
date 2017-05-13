
package com.mycompany.rest.dao;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dao-springConfig.xml"});
        
        StudentDAO stdDAO = (StudentDAO) context.getBean("studentDAO");
        
//        Student student = new Student();
//        student.setFirstname("Jimmy");
//        student.setLastname("Nabors");
//        student.setAddress("1600 Main");
        
 //       stdDAO.persist(student);
        
       List<Student> list = stdDAO.getAllStudents();
       
       for (Student std : list){
           System.out.println("First Name: "+ std.getFirstname());
       }
   
       
    }
}
