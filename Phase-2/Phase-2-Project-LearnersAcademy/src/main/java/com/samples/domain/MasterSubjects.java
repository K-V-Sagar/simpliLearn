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
@Table(name="MasterSubjects")
public class MasterSubjects {

	@Id
	@Column(name="subjectID")
	private String subjectID;
		
	@Column(name="subjectName")
	private String subjectName;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="classID")
	private MasterClasses masterclasses;
	
	// *******************************
	
	public MasterSubjects(String subjectID, String subjectName, MasterClasses masterclasses) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.masterclasses = masterclasses;
	}
	
	
	
	public MasterSubjects() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public MasterClasses getMasterclasses() {
		return masterclasses;
	}

	public void setMasterclasses(MasterClasses masterclasses) {
		this.masterclasses = masterclasses;
	}


	
}
