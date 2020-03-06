package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubjectDate {
	@Id
	private long id;
	@ManyToOne
	private Student studentId;
	@ManyToOne
	private Subject subjectId;
	private long grade;
	public SubjectDate() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Student getStudentId() {
		return studentId;
	}
	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}
	public Subject getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Subject subjectId) {
		this.subjectId = subjectId;
	}
	public long getGrade() {
		return grade;
	}
	public void setGrade(long grade) {
		this.grade = grade;
	}
	
	
}
