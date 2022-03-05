package com.nekit.desafio.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.nekit.desafio.forms.UserForm;

@Entity
@Embeddable
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user", nullable=false)
	private Integer idUser;
	@Column(name="login_user", nullable=false, length=12)
	private String login;
	@Column(name="password_user", nullable=false, length=100)
	private String password;
	@Column(name="last_login_date", nullable=true)
	private LocalDateTime lastLoginDate;
	
// ---- CONSTRUCTOR'S
	//--Default
	public User() {
		
	}
	//--Full
	public User(String login, String password, LocalDateTime lastLoginDate) {
		super();
		this.login = login;
		this.password = password;
		this.lastLoginDate = lastLoginDate;
	}
	
	//--Form
	public User(UserForm userForm) {
		this.login = userForm.getLogin();
		this.password = userForm.getPassword();
		this.lastLoginDate = LocalDateTime.now();
	}
	
// ----------------- GETTER'S & SETTER'S -------------------------
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(LocalDateTime lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
// ----------------- HASH CODE -------------------------
	@Override
	public int hashCode() {
		return Objects.hash(idUser, lastLoginDate, login, password);
	}
	
// ----------------- EQUALS -------------------------
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(idUser, other.idUser) && Objects.equals(lastLoginDate, other.lastLoginDate)
				&& Objects.equals(login, other.login) && Objects.equals(password, other.password);
	}
	
// ----------------- TO STRING -------------------------
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", login=" + login + ", password=" + password + ", lastLoginDate="
				+ lastLoginDate + "]";
	}
	
}
