package com.rick.management.car.spring.persit.domain;

import java.util.Date;
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
@Table(name = "chi_tiet_dat_xe")
public class ChiTietDatXe implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "chi_tiet_dat_xe_id")
	private Integer chiTietDatXeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dat_xe_id")
	private DatXe datXe;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dm_xe_id")
	private DmXe dmXe;

	@Column(name = "ngay_thue")
	private Date ngayThue;

	@Column(name = "ngay_tra")
	private Date ngayTra;

	@Column(name = "so_luong")
	private Integer soLuong;

	@Column(name = "so_tien")
	private Double soTien;

	@Column(name = "tinh_trang")
	private String tinhTrang;

	public ChiTietDatXe() {
	}

	public ChiTietDatXe(DmXe dmXe) {
		this.dmXe = dmXe;
	}

	public ChiTietDatXe(DatXe datXe, DmXe dmXe, Date ngayThue, Date ngayTra,
			Integer soLuong, Double soTien, String tinhTrang) {
		this.datXe = datXe;
		this.dmXe = dmXe;
		this.ngayThue = ngayThue;
		this.ngayTra = ngayTra;
		this.soLuong = soLuong;
		this.soTien = soTien;
		this.tinhTrang = tinhTrang;
	}

	public Integer getChiTietDatXeId() {
		return this.chiTietDatXeId;
	}

	public void setChiTietDatXeId(Integer chiTietDatXeId) {
		this.chiTietDatXeId = chiTietDatXeId;
	}

	public DatXe getDatXe() {
		return this.datXe;
	}

	public void setDatXe(DatXe datXe) {
		this.datXe = datXe;
	}

	public DmXe getDmXe() {
		return this.dmXe;
	}

	public void setDmXe(DmXe dmXe) {
		this.dmXe = dmXe;
	}

	public Date getNgayThue() {
		return this.ngayThue;
	}

	public void setNgayThue(Date ngayThue) {
		this.ngayThue = ngayThue;
	}

	public Date getNgayTra() {
		return this.ngayTra;
	}

	public void setNgayTra(Date ngayTra) {
		this.ngayTra = ngayTra;
	}

	public Integer getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public Double getSoTien() {
		return this.soTien;
	}

	public void setSoTien(Double soTien) {
		this.soTien = soTien;
	}

	public String getTinhTrang() {
		return this.tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

}
