package domen;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "EXAM")
public class Exam implements Serializable {
	private static final long serialVersionUID = -2030691855570877736L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EXAM")
	private long id;
	@ManyToOne
	@JoinColumn(name="STUDENT_ID")
	private Student student;
	@OneToOne
	@JoinColumn(name = "PROFESSOR_ID")
	private Professor professor;
	@OneToOne
	@JoinColumn(name = "SUBJECT_ID")
	private Subject subject;
	@Column(name = "MARK")
	private String mark;
	@Column(name = "EXAM_DATE")
	private Date examDate;
	
	public Exam(Student student, Professor professor, Subject subject, String mark, Date examDate) {
		super();
		this.student = student;
		this.professor = professor;
		this.subject = subject;
		this.mark = mark;
		this.examDate = examDate;
	}

	public Exam() {
		super();
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	@Override
	public String toString() {
		return "Exam [student=" + student + ", professor=" + professor + ", subject=" + subject + ", mark=" + mark
				+ ", examDate=" + examDate + "]";
	}

	
}
