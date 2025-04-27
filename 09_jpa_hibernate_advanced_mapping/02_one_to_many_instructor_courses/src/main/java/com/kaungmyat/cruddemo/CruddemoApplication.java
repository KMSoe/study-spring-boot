package com.kaungmyat.cruddemo;

import com.kaungmyat.cruddemo.dao.AppDAO;
import com.kaungmyat.cruddemo.entity.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {

		return runner -> {
//			 createCourseAndStudents(appDAO);

//			 findCourseAndStudents(appDAO);

//			 findStudentAndCourses(appDAO);

//			 addMoreCoursesForStudent(appDAO);

//			 deleteStudent(appDAO);
		};
	}

	private void createCourseAndStudents(AppDAO appDAO) {
		Course tempCourse = new Course("Pacman - How To Score One Million Points");

		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");

		tempCourse.addStudent(tempStudent1);
		tempCourse.addStudent(tempStudent2);

		System.out.println("Saving the course: " + tempCourse);
		System.out.println("associated students: " + tempCourse.getStudents());

		appDAO.saveCourse(tempCourse);

		System.out.println("Done!");
	}

	private void findCourseAndStudents(AppDAO appDAO) {
		int id = 10;
		Course tempCourse = appDAO.findCourseAndStudentsByCourseId(id);

		System.out.println("Loaded course: " + tempCourse);
		System.out.println("Students: " + tempCourse.getStudents());

		System.out.println("Done!");
	}

	private void findStudentAndCourses(AppDAO appDAO) {
		int id = 2;
		Student tempStudent = appDAO.findStudentAndCoursesByStudentId(id);

		System.out.println("Loaded student: " + tempStudent);
		System.out.println("Courses: " + tempStudent.getCourses());

		System.out.println("Done!");
	}

	private void addMoreCoursesForStudent(AppDAO appDAO) {
		int id = 2;
		Student tempStudent = appDAO.findStudentAndCoursesByStudentId(id);

		Course tempCourse1 = new Course("Rubik's Cube - How to Speed Cube");
		Course tempCourse2 = new Course("Atari 2600 - Game Development");

		tempStudent.addCourse(tempCourse1);
		tempStudent.addCourse(tempCourse2);

		System.out.println("Updating student: " + tempStudent);
		System.out.println("associated courses: " + tempStudent.getCourses());

		appDAO.updateStudent(tempStudent);

		System.out.println("Done!");
	}

	private void deleteStudent(AppDAO appDAO) {
		int id = 1;
		System.out.println("Deleting student id: " + id);
		appDAO.deleteStudentById(id);
		System.out.println("Done!");
	}
}
