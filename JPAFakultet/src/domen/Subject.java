package domen;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "SUBJECT")
public class Subject implements Serializable {
	private static final long serialVersionUID = -7155643503342355880L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SUBJECT")
	private long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "TERM")
	private int term;
	@Column(name = "ESPB")
	private int espb;
	
	public Subject(String name, int term, int espb) {
		super();
		this.name = name;
		this.term = term;
		this.espb = espb;
	}

	public Subject() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public int getEspb() {
		return espb;
	}

	public void setEspb(int espb) {
		this.espb = espb;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", term=" + term + ", espb=" + espb + "]";
	}

}
