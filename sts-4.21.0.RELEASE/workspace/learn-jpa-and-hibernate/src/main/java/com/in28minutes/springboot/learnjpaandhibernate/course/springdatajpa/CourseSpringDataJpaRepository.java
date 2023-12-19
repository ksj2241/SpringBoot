package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

	List<Course> findByAuthor(String author);	// findBy라는 명명규칙을 지켜야 한다.
	List<Course> findByName(String name);	// findBy라는 명명규칙을 지켜야 한다.
}
