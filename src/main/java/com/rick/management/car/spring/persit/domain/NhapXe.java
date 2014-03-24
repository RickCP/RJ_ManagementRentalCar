package com.rick.management.car.spring.persit.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhap_xe")
public class NhapXe implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "nhap_xe_id")
	private Integer nhapXeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quanli_id")
	private User user;

	@Column(name = "ngay_nhap")
	private Date ngayNhap;

	@Column(name = "tong_so_tien")
	private Double tongSoTien;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhapXe")
	private List<ChiTietNhapXe> chiTietNhapXes;

	public NhapXe() {
	}

	public NhapXe(User user, Date ngayNhap, Double tongSoTien, List chiTietNhapXes) {
		this.user = user;
		this.ngayNhap = ngayNhap;
		this.tongSoTien = tongSoTien;
		this.chiTietNhapXes = chiTietNhapXes;
	}

	public Integer getNhapXeId() {
		return this.nhapXeId;
	}

	public void setNhapXeId(Integer nhapXeId) {
		this.nhapXeId = nhapXeId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getNgayNhap() {
		return this.ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public Double getTongSoTien() {
		return this.tongSoTien;
	}

	public void setTongSoTien(Double tongSoTien) {
		this.tongSoTien = tongSoTien;
	}

	public List getChiTietNhapXes() {
		return this.chiTietNhapXes;
	}

	public void setChiTietNhapXes(List chiTietNhapXes) {
		this.chiTietNhapXes = chiTietNhapXes;
	}

}
