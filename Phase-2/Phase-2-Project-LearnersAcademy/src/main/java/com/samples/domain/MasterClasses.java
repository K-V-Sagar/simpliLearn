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
import javax.persistence.ManyToMany;


@Entity
@Table(name="MasterClasses")
public class MasterClasses {
	
	@Id
	@Column(name="classID")
	private String classID;
	
	@Column(name="className")
	private String className;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="teacherID")
	private MasterTeachers masterteachers;
	
	@OneToMany(mappedBy = "masterclasses", cascade= {CascadeType.PERSIST, CascadeType.REMOVE}) 
	private Set<MasterStudents> studentsSet = new HashSet<>();
	
	
	
	@OneToMany(mappedBy = "masterclasses", cascade= {CascadeType.PERSIST, CascadeType.REMOVE}) 
	private Set<MasterSubjects> subjectsSet = new HashSet<>();


	// *******************************
	
	
	public MasterClasses(String classID, String className, MasterTeachers masterteachers) {
		super();
		this.classID = classID;
		this.className = className;
		this.masterteachers = masterteachers;

	}
	
	// for master list
	public MasterClasses(String classID, String className) {
		super();
		this.classID = classID;
		this.className = className;

	}
		
	public MasterClasses() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getClassID() {
		return classID;
	}


	public void setClassID(String classID) {
		this.classID = classID;
	}



	public String getClassName() {
		return className;
	}



	public void setClassName(String className) {
		this.className = className;
	}



	public MasterTeachers getMasterteachers() {
		return masterteachers;
	}



	public void setMasterteachers(MasterTeachers masterteachers) {
		this.masterteachers = masterteachers;
	}



	public Set<MasterStudents> getStudentsSet() {
		return studentsSet;
	}



	public void setStudentsSet(Set<MasterStudents> studentsSet) {
		this.studentsSet = studentsSet;
	}



	public Set<MasterSubjects> getSubjectsSet() {
		return subjectsSet;
	}



	public void setSubjectsSet(Set<MasterSubjects> subjectsSet) {
		this.subjectsSet = subjectsSet;
	}
	
	

}
