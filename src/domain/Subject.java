package domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Subject {
	@Id
	private String name;
	private long espb;
	private StudyProgram sp;
	private String semester;
	@ManyToMany(mappedBy = "subjects")
	private List<Professor> professors;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SubjectDate> sd;

	public Subject(String name, long espb, StudyProgram sp, String semester) {
		super();
		this.name = name;
		this.espb = espb;
		this.sp = sp;
		this.semester = semester;
	}

	public Subject() {
		super();
	}

	public List<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}

	public List<SubjectDate> getSd() {
		return sd;
	}

	public void setSd(List<SubjectDate> sd) {
		this.sd = sd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getEspb() {
		return espb;
	}

	public void setEspb(long espb) {
		this.espb = espb;
	}

	public StudyProgram getSp() {
		return sp;
	}

	public void setSp(StudyProgram sp) {
		this.sp = sp;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (espb ^ (espb >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((semester == null) ? 0 : semester.hashCode());
		result = prime * result + ((sp == null) ? 0 : sp.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (espb != other.espb)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (semester == null) {
			if (other.semester != null)
				return false;
		} else if (!semester.equals(other.semester))
			return false;
		if (sp == null) {
			if (other.sp != null)
				return false;
		} else if (!sp.equals(other.sp))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", espb=" + espb + ", sp=" + sp + ", semester=" + semester + "]";
	}

}
