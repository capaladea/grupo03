package com.unla.grupo03.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name="user_rol", uniqueConstraints=@UniqueConstraint(columnNames= {"rol", "user_id"}))
public class UserRol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable=false)
	private User user;

	@Column(name="role", nullable=false, length=20)
	private String role;
	
	public UserRol(User user, String role) {
		this.user = user;
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserRol [id=" + id + ", role=" + role + "]";
	}	

}