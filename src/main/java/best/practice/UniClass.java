package best.practice;

public class UniClass {  // university class

	private int id;
	private Student student;
	private Discipline discipline;
	private Professor professor;
	private String semester;
	private double grade;
	
	public UniClass() {}
	
	public UniClass(int id, Student student, Discipline discipline, Professor professor, String semester, double grade) {
		this.id = id;

		setStudent(student);
		student.getUniClasses().add(this);      // Guarantee referential integrity.
		
		setDiscipline(discipline);
		discipline.getUniClasses().add(this);   // Guarantee referential integrity.
		
		setProfessor(professor);
		professor.getUniClasses().add(this);    // Guarantee referential integrity.
		
		this.semester = semester;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

}