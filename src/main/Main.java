package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Department;
import domain.Person;
import domain.Professor;
import domain.Role;
import domain.Roles;
import domain.StudyProgram;
import domain.Subject;

public class Main {

	public static void main(String[] args) {
		Professor professor=new Professor();
		professor.setCalling("calling1");
		professor.setDepartment(new Department("rii"));
		professor.setFname("fname1");
		professor.setLname("lname1");
		professor.setId("qe");
		List<Roles> listroles=new ArrayList<>();
		listroles.add(new Roles(Role.PROFESSOR));
		professor.setStartDate(new Date(System.currentTimeMillis()));
		professor.setRoles(listroles);
		List<Subject> subjects=new ArrayList<>();
		subjects.add(new Subject("uvit", 6l, new StudyProgram("inf"), "2"));
		professor.setSubjects(subjects);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("XPU");
		EntityManager em=emf.createEntityManager();
		em.merge(professor);
		em.close();
		emf.close();

	}

}
