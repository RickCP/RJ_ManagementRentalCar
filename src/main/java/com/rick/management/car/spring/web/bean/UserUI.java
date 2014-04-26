package com.rick.management.car.spring.web.bean;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
public class UserUI {
	private Integer id;
	@NotNull
	private String username;
	@NotNull
	private String password;
	@Email
	@NotNull
	private String email;
	@NotNull
	private String hoTen;
	private String gioiTinh;
	@NotNull
	private String ngaySinh;
	@NotNull
	private String diaChi;
	@NotNull
	private String dienThoai;
	@NotNull
	private String cmnd;
	@NotNull
	private String rePassword;

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

}
