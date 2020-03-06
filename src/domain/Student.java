package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student extends Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fname, lname;
	private Date dob;
	@OneToOne
	private StudyProgram sp;
	@Enumerated(EnumType.STRING)
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SubjectDate> subjectDates;

	public Student(String indexId, String fname, String lname, Date dob, StudyProgram sp) {
		super();
		this.id = indexId;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.sp = sp;
	}

	public Student() {
		super();
	}

	public List<SubjectDate> getSubjectDates() {
		return subjectDates;
	}

	public void setSubjectDates(List<SubjectDate> subjectDates) {
		this.subjectDates = subjectDates;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public StudyProgram getSp() {
		return sp;
	}

	public void setSp(StudyProgram sp) {
		this.sp = sp;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
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
		Student other = (Student) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
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
		return "Student [indexId=" + id + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", sp=" + sp
				+ "]";
	}

}
