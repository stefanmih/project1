package domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
@Entity
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long randomId;
	@ManyToMany(mappedBy = "roles") 
	private List<Person> personsId;
	@Enumerated(EnumType.STRING)
	private Role role;
	public Roles() {
		super();
	}
	public Roles(Role r) {
		super();
		role=r;
	}
	public long getRandomId() {
		return randomId;
	}
	public void setRandomId(long randomId) {
		this.randomId = randomId;
	}
	public List<Person> getPersonsId() {
		return personsId;
	}
	public void setPersonsId(List<Person> personsId) {
		this.personsId = personsId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
