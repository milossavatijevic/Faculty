package domen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Inheritance
@DiscriminatorColumn(name="PERSON_TYPE")
@Table(name = "PERSON")
public class Person implements Serializable {
	private static final long serialVersionUID = 3548209884653876434L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PERSON")
	private long id;
	@Column(name = "FIRSTNAME")
	private String firstname;
	@Column(name = "LASTNAME")
	private String lastname;
	@OneToOne
	@JoinColumn(name = "ID_USERNAME")
	private Username username;
	
	public Person(String firstname, String lastname, Username username) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
	}

	public Person() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Username getUsername() {
		return username;
	}

	public void setUsername(Username username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ "]";
	}

}
