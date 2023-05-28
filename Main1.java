package com.hibernate.lab;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Main1 {
	public static void main( String[] args )
    {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
//	
//	
//    Transaction tx = session.beginTransaction();
//    
//    Teacher t1 = new Teacher();
//    t1.setTeacher_name("Shawin Sir");
//    t1.setTeacher_Id(1);
//    
//    Student student1 = new Student();
//    student1.setStud_name("Sumaiyya");
//    student1.setStud_mob(70303073);
//    student1.setTeacher(t1);
//   
//    Student student2 = new Student();
//    student2.setStud_name("Shrutika");
//    student2.setStud_mob(5462381); 
//    student2.setTeacher(t1);
//    
//    session.save(student1);
//    session.save(student2);
//    session.save(t1);
//   
//    List<Student> list = new ArrayList<Student>();
//    list.add(student1);
//    list.add(student2);
//    t1.setStudents(list);
//    
//     tx.commit(); 
    
    //fetch student and teacher data
    
    Teacher t =  session.get(Teacher.class,1);
    System.out.println(t.getTeacher_name());
    
    for(Student s : t.getStudents())
    {
    	System.out.println(s.getStud_name());
    	System.out.println(s.getStud_mob());
    }
    
    //retriving the data using HQL
   // String query = "from Student where Stud_mob="
     
	session.close();
	factory.close();
}
}
