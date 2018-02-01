package intermediate_entity;

import java.io.Serializable;

public class UniClass {  // university class

	public static class Id implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private Integer studentId;
		private Integer discId;
		private Integer profId;
		private String semester;

		public Id() {}

		public Id(int studentId, int discId, int profId) {
			this.studentId = studentId;
			this.discId = discId;
			this.profId = profId;
		}

		public boolean equals(Object obj) {
	        if (obj != null && obj instanceof Id) {
	        	final Id other = (Id) obj;
	            return other.studentId.equals(studentId) && 
	        	           other.discId.equals(discId) &&
	        	               other.profId.equals(profId);
	        } else {
	        	return false;
	        }
	    }

	    public int hashCode() {
	    	return (studentId + discId + profId + semester).hashCode();
	    }
	}

	private Id id = new Id();
	private double grade;
	private Student student;
	private Discipline discipline;
	private Professor professor;
	
	public UniClass() {}
	
	public UniClass(String semester, double grade, Student student, Discipline discipline, Professor professor) {
		this.id.semester = semester;
		this.grade = grade;
		this.student = student;
		this.discipline = discipline;
		this.professor = professor;
		this.id.studentId = this.student.getStudentId();
		this.id.discId = this.discipline.getDiscId();
		this.id.profId = this.professor.getProfId();
		student.getUniClasses().add(this);
		discipline.getUniClasses().add(this);
		professor.getUniClasses().add(this);
	}

	public String getSemester() {
		return this.id.semester;
	}
	
	public void setSemester(String semester) {
		this.id.semester = semester;
	}
	
	public Id getId() {
		return id;
	}
	
	public void setId(Id id) {
		this.id = id;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

}