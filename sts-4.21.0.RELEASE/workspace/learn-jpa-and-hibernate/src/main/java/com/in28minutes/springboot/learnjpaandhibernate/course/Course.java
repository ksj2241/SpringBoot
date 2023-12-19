package com.in28minutes.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// name 생략 시, Course 라는 클래스랑 이름이 같은 테이블을 호출하고 아니면 name의 지정된 테이블을 지정한다
// 클래스 안에 @Id, @Column 어노테이션도 마찬가지다
@Entity(name="Course")
public class Course {

	@Id
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="author")
	private String author;
	
	public Course() {
		
	}
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
	
}
