package domen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
@DiscriminatorValue("PROF")
public class Professor extends Person {
	private static final long serialVersionUID = -2894654709586464104L;
	@Column(name = "START_DATE")
	private Date startDate;
	@ManyToOne
	@JoinColumn(name = "TITLE")
	private Title title;
	@ManyToOne
	@JoinColumn(name = "DEPARTMENT")
	private Department department;
	@ManyToMany
	@JoinTable(name = "PROFESSOR_SUBJECT", joinColumns = @JoinColumn(name = "PROFESSOR_ID", referencedColumnName = "ID_PERSON"),
			inverseJoinColumns = @JoinColumn(name = "SUBJECT_ID", referencedColumnName = "ID_SUBJECT"))
	private List<Subject> subjects;
	
	public Professor(String firstname, String lastname, Username username, Date startDate,
			Title title, Department department) {
		super(firstname, lastname, username);
		this.startDate = startDate;
		this.title = title;
		this.department = department;
		subjects = new ArrayList<>();
	}

	public Professor(String firstname, String lastname, Username username) {
		super(firstname, lastname, username);
	}
	
	public Professor() {
		super();
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Professor [startDate=" + startDate + ", title=" + title + ", toString()=" + super.toString() + "]";
	}
	
	
}
