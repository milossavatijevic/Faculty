package domen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TITLE")
public class Title implements Serializable {
	private static final long serialVersionUID = 7528756021632121352L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TITLE")
	private long id;
	@Column(name = "NAME")
	private String name;
	
	public Title(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Title() {
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
		return "Title [id=" + id + ", name=" + name + "]";
	}
	
	
}
