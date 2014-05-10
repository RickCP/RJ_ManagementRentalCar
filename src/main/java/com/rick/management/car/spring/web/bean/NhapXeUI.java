package com.rick.management.car.spring.web.bean;

import javax.validation.constraints.NotNull;


/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
public class NhapXeUI {
	private String nhapXeId;
	
	private String user;

	private String ngayNhap;
	
	private String tongSoTien;
	
	private String tenLoaiXe;
	
	private String tenXe;
	@NotNull
	private String soLuong;
	
	public String getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(String soLuong) {
		this.soLuong = soLuong;
	}

	public String getTenXe() {
		return tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public String getTenLoaiXe() {
		return tenLoaiXe;
	}

	public void setTenLoaiXe(String tenLoaiXe) {
		this.tenLoaiXe = tenLoaiXe;
	}

	public String getNhapXeId() {
		return nhapXeId;
	}

	public void setNhapXeId(String nhapXeId) {
		this.nhapXeId = nhapXeId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public String getTongSoTien() {
		return tongSoTien;
	}

	public void setTongSoTien(String tongSoTien) {
		this.tongSoTien = tongSoTien;
	}

}
