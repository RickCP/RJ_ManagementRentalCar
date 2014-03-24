package com.rick.management.car.spring.persit.domain;

import java.util.Date;
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
@Table(name = "user")
public class User implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "quanli_id")
	private Integer quanliId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "ho_ten")
	private String hoTen;

	@Column(name = "ngay_sinh")
	private Date ngaySinh;

	@Column(name = "gioi_tinh")
	private Short gioiTinh;

	@Column(name = "dien_thoai")
	private String dienThoai;

	@Column(name = "cmnd")
	private long cmnd;

	@Column(name = "email")
	private String email;

	@Column(name = "diachi")
	private String diachi;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<NhapXe> nhapXes;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<DmQuyen> dmQuyens;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<DatXe> datXes;

	public User() {
	}

	public User(String userName, String password, long cmnd) {
		this.userName = userName;
		this.password = password;
		this.cmnd = cmnd;
	}

	public Integer getQuanliId() {
		return this.quanliId;
	}

	public void setQuanliId(Integer quanliId) {
		this.quanliId = quanliId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Short getGioiTinh() {
		return this.gioiTinh;
	}

	public void setGioiTinh(Short gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public long getCmnd() {
		return this.cmnd;
	}

	public void setCmnd(long cmnd) {
		this.cmnd = cmnd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public List<NhapXe> getNhapXes() {
		return nhapXes;
	}

	public void setNhapXes(List<NhapXe> nhapXes) {
		this.nhapXes = nhapXes;
	}

	public List<DmQuyen> getDmQuyens() {
		return dmQuyens;
	}

	public void setDmQuyens(List<DmQuyen> dmQuyens) {
		this.dmQuyens = dmQuyens;
	}

	public List<DatXe> getDatXes() {
		return datXes;
	}

	public void setDatXes(List<DatXe> datXes) {
		this.datXes = datXes;
	}

}
