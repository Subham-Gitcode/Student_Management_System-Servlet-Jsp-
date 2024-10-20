package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Student;

public class StudentDao {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction et = em.getTransaction();
	
	public void saveStudent(Student s) {
		et.begin();
		em.persist(s);
		et.commit();
	}

	public List<Student> findall() {
		Query q = em.createQuery("select s from Student s");
		List<Student> los = q.getResultList();
		return los;
	}

	public void deleteStudentbyId(int id) {
		// TODO Auto-generated method stub
		Student s= em.find(Student.class, id);
		et.begin();
		em.remove(s);
		et.commit();
	}
	public Student findStudentById(int id) {
		return em.find(Student.class, id);
	}

	public void updateStudentById(int id, String name, String email, String dob, String gender) {
		Student s= em.find(Student.class, id);
		
		s.setName(name);
		s.setEmail(email);
		s.setDob(dob);
		s.setGender(gender);
		
		et.begin();
		em.merge(s);
		et.commit();
		
	} 
}
