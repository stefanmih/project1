package domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class StudyProgram {
	@Id
	private String name;
	private List<Subject> subjects;
	@OneToOne(mappedBy = "sp", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Student s;
	public StudyProgram() {
		super();
	}
	public StudyProgram(String name) {
		super();
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	
}
