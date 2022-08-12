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
@Table(name="MasterStudents")
public class MasterStudents {
	
	@Id
	@Column(name="studentID")
	private String studentID;
	
	@Column(name="studentName")
	private String studentName;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="classID")
	private MasterClasses masterclasses;

	// *******************************
	
	
	public MasterStudents(String studentID, String studentName, MasterClasses masterclasses) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.masterclasses = masterclasses;
	}
	
	// for master list
	public MasterStudents(String studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public MasterStudents() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public MasterClasses getMasterclasses() {
		return masterclasses;
	}

	public void setMasterclasses(MasterClasses masterclasses) {
		this.masterclasses = masterclasses;
	}

	
	
}