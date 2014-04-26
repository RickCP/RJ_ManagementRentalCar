package com.rick.management.car.spring.persit.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "quyen")
public class Quyen implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "quyen_id")
	private Integer quyenId;

	@Column(name = "quyen_name")
	private String quyenName;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "quyen")
	private Set<User> users = new HashSet<User>(0);

	public Quyen() {
	}

	public Quyen(String quyenName) {
		this.quyenName = quyenName;
	}

	public Quyen(String quyenName, Set<User> users) {
		this.quyenName = quyenName;
		this.users = users;
	}

	public Integer getQuyenId() {
		return this.quyenId;
	}

	public void setQuyenId(Integer quyenId) {
		this.quyenId = quyenId;
	}

	public String getQuyenName() {
		return this.quyenName;
	}

	public void setQuyenName(String quyenName) {
		this.quyenName = quyenName;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
