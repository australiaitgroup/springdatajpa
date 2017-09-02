package com.jiangren.j2ee.springjpa.many2many.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.json.JSONArray;
import org.json.JSONObject;

@Entity
public class Subject {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@ManyToMany(mappedBy = "subjects")
	private Set<Student> students;
	
    public Subject(){
    }
    
    public Subject(String name){
    	this.name = name;
    }
    
    public Subject(String name, Set<Student> students){
    	this.name = name;
    	this.students = students;
    }
	
	// name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// students
	public Set<Student> getStudents() {
		return students;
	}
	
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString(){
		String info = "";
		JSONObject jsonInfo = new JSONObject();
		jsonInfo.put("name",this.name);
		JSONArray studentArray = new JSONArray();
		if(this.students != null && students.size() > 0){
			this.students.forEach(student->{
				JSONObject subJson = new JSONObject();
				subJson.put("name", student.getName());
				studentArray.put(subJson);
			});
		}
		jsonInfo.put("students", studentArray);
		info = jsonInfo.toString();
		return info;
	}
}
