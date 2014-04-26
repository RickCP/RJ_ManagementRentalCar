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
@Table(name = "hang_xe")
public class HangXe implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "hang_xe_id")
	private Integer hangXeId;

	@Column(name = "ten_hang_xe")
	private String tenHangXe;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hangXe")
	private Set<LoaiXe> loaiXes = new HashSet<LoaiXe>(0);

	public HangXe() {
	}

	public HangXe(String tenHangXe) {
		this.tenHangXe = tenHangXe;
	}

	public HangXe(String tenHangXe, Set<LoaiXe> loaiXes) {
		this.tenHangXe = tenHangXe;
		this.loaiXes = loaiXes;
	}

	public Integer getHangXeId() {
		return this.hangXeId;
	}

	public void setHangXeId(Integer hangXeId) {
		this.hangXeId = hangXeId;
	}

	public String getTenHangXe() {
		return this.tenHangXe;
	}

	public void setTenHangXe(String tenHangXe) {
		this.tenHangXe = tenHangXe;
	}

	public Set<LoaiXe> getLoaiXes() {
		return this.loaiXes;
	}

	public void setLoaiXes(Set<LoaiXe> loaiXes) {
		this.loaiXes = loaiXes;
	}

}
