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
import javax.persistence.OneToMany;
@Entity
@DiscriminatorValue("STUD")
public class Student extends Person {
	private static final long serialVersionUID = -1849370881558701018L;
	@Column(name = "INDEX_NUMBER")
	private String indexNumber;
	@Column(name = "BIRTH_DATE")
	private Date birthDate;
	@ManyToOne
	@JoinColumn(name = "PROGRAM")
	private StudyProgram program;
	@OneToMany(mappedBy = "student")
	private List<Exam> exams;
	
	public Student(String firstname, String lastname, Username username, String indexNumber,
			Date birthDate, StudyProgram program) {
		super(firstname, lastname, username);
		this.indexNumber = indexNumber;
		this.birthDate = birthDate;
		this.program = program;
		this.exams = new ArrayList<>();
	}

	public Student(String firstname, String lastname, Username username) {
		super(firstname, lastname, username);
	}
	
	public Student() {
		super();
	}

	public String getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "Student [indexNumber=" + indexNumber + ", birthDate=" + birthDate + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
