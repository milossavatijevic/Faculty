package domen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENT")
public class Department implements Serializable {
	private static final long serialVersionUID = -3982121374176397525L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DEPARTMENT")
	private long id;
	@Column(name = "NAME")
	private String name;
	
	public Department(String name) {
		super();
		this.name = name;
	}

	public Department() {
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

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
}
