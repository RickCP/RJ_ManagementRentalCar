package com.rick.management.car.spring.web.bean;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
public class DatXeUI {
	private String ngayThue;
	private String ngayTra;
	private String lienHe;
	private String soTien;
	private String tinhTrang;
	private String soLuong;
	private Integer dmXeId;

	public Integer getDmXeId() {
		return dmXeId;
	}

	public void setDmXeId(Integer dmXeId) {
		this.dmXeId = dmXeId;
	}

	public String getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(String soLuong) {
		this.soLuong = soLuong;
	}

	public String getNgayThue() {
		return ngayThue;
	}

	public void setNgayThue(String ngayThue) {
		this.ngayThue = ngayThue;
	}

	public String getNgayTra() {
		return ngayTra;
	}

	public void setNgayTra(String ngayTra) {
		this.ngayTra = ngayTra;
	}

	public String getLienHe() {
		return lienHe;
	}

	public void setLienHe(String lienHe) {
		this.lienHe = lienHe;
	}

	public String getSoTien() {
		return soTien;
	}

	public void setSoTien(String soTien) {
		this.soTien = soTien;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

}
