package domen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "USERNAME")
public class Username implements Serializable {
	private static final long serialVersionUID = 3107101840391963542L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USERNAME")
	private long id;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;
	@ManyToMany
	@JoinTable(name = "USERNAME_ROLE", joinColumns = @JoinColumn(name = "USERNAME_ID", referencedColumnName = "ID_USERNAME"),
			inverseJoinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID_ROLE"))
	private List<Role> roles;
	
	public Username(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.roles = new ArrayList<>();
	}

	public Username() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Username [id=" + id + ", username=" + username + ", password=" + password + ", roles=" + roles + "]";
	}

	
}
