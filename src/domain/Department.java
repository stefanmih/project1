package domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Department {
	@Id
	private String nameId;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Professor> list;
	public Department() {
		super();
	}
	
	public Department(String nameId) {
		super();
		this.nameId = nameId;
	}

	public String getNameId() {
		return nameId;
	}
	public void setNameId(String nameId) {
		this.nameId = nameId;
	}
	public List<Professor> getList() {
		return list;
	}
	public void setList(List<Professor> list) {
		this.list = list;
	}
	
}
