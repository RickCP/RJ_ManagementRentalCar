package com.rick.management.car.spring.persit.domain;

import java.util.List;

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

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "quyen_id")
	private Integer quyenId;

	@Column(name = "quyen_name")
	private String quyenName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "quyen")
	private List<DmQuyen> dmQuyens;

	public Quyen() {
	}

	public Quyen(String quyenName) {
		this.quyenName = quyenName;
	}

	public Quyen(String quyenName, List dmQuyens) {
		this.quyenName = quyenName;
		this.dmQuyens = dmQuyens;
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

	public List getDmQuyens() {
		return this.dmQuyens;
	}

	public void setDmQuyens(List dmQuyens) {
		this.dmQuyens = dmQuyens;
	}

}
