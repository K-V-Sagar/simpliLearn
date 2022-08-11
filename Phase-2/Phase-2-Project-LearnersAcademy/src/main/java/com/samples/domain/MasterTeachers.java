package com.samples.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.OneToMany;


@Entity
@Table(name="MasterTeachers")
public class MasterTeachers {
	
	@Id
	@Column(name="teacherID")
	private String teacherID;
	
	@Column(name="teacherName")
	private String teacherName;
	
	@OneToMany(mappedBy = "masterteachers", cascade= {CascadeType.PERSIST, CascadeType.REMOVE}) 
	private Set<MasterClasses> classesSetFromTeachers = new HashSet<>();

	// *******************************
	
	
	
	public MasterTeachers(String teacherID, String teacherName) {
		super();
		this.teacherID = teacherID;
		this.teacherName = teacherName;
	}
	
	public MasterTeachers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Set<MasterClasses> getClasses() {
		return classesSetFromTeachers;
	}

	public void setClasses(Set<MasterClasses> classes) {
		this.classesSetFromTeachers = classes;
	}

		
}