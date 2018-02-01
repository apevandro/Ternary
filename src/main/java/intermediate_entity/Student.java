package intermediate_entity;

import java.util.HashSet;
import java.util.Set;

public class Student {
	
	private int studentId;
	private String name;
	private String address;
	private String city;
	private Set<UniClass> uniClasses = new HashSet<UniClass>();
	
	public Student() {}
	
	public Student(int studentId, String name, String address, String city) {
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.city = city;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<UniClass> getUniClasses() {
		return uniClasses;
	}

	public void setUniClasses(Set<UniClass> uniClasses) {
		this.uniClasses = uniClasses;
	}

}