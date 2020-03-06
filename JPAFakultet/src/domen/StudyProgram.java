package domen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "STUDY_PROGRAM")
public class StudyProgram implements Serializable {
	private static final long serialVersionUID = -4118369415543238880L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROGRAM")
	private long id;
	@Column(name = "NAME")
	private String name;
	@ManyToMany
	@JoinTable(name = "PROGRAM_SUBJECT", joinColumns = @JoinColumn(name = "PROGRAM_ID", referencedColumnName = "ID_PROGRAM"),
			inverseJoinColumns = @JoinColumn(name = "SUBJECT_ID", referencedColumnName = "ID_SUBJECT"))
	private List<Subject> subjects;
	
	public StudyProgram(String name) {
		super();
		this.name = name;
		subjects = new ArrayList<>();
	}

	public StudyProgram() {
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
	
	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "StudyProgram [id=" + id + ", name=" + name + ", subjects=" + subjects + "]";
	}

	
}
