package com.rick.management.car.spring.persit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chi_tiet_nhap_xe")
public class ChiTietNhapXe implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "chi_tiet_nhap_xe_id")
	private Integer chiTietNhapXeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nhap_xe_id")
	private NhapXe nhapXe;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dm_xe_id")
	private DmXe dmXe;

	@Column(name = "so_luong")
	private Integer soLuong;

	@Column(name = "don_gia")
	private Double donGia;

	public ChiTietNhapXe() {
	}

	public ChiTietNhapXe(NhapXe nhapXe, DmXe dmXe, Integer soLuong, Double donGia) {
		this.nhapXe = nhapXe;
		this.dmXe = dmXe;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public Integer getChiTietNhapXeId() {
		return this.chiTietNhapXeId;
	}

	public void setChiTietNhapXeId(Integer chiTietNhapXeId) {
		this.chiTietNhapXeId = chiTietNhapXeId;
	}

	public NhapXe getNhapXe() {
		return this.nhapXe;
	}

	public void setNhapXe(NhapXe nhapXe) {
		this.nhapXe = nhapXe;
	}

	public DmXe getDmXe() {
		return this.dmXe;
	}

	public void setDmXe(DmXe dmXe) {
		this.dmXe = dmXe;
	}

	public Integer getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public Double getDonGia() {
		return this.donGia;
	}

	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}

}
