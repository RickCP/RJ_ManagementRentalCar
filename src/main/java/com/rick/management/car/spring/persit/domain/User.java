package com.rick.management.car.spring.persit.domain;

import java.util.Date;
import java.util.HashSet;
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
@Table(name = "user")
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	private Integer id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "quyen_id")
	private Quyen quyen;

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

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	private Set<NhapXe> nhapXes = new HashSet<NhapXe>(0);

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	private Set<DatXe> datXes = new HashSet<DatXe>(0);

	public User() {
	}

	public User(String userName, String password, long cmnd) {
		this.userName = userName;
		this.password = password;
		this.cmnd = cmnd;
	}

	public User(Quyen quyen, String userName, String password, String hoTen,
			Date ngaySinh, Short gioiTinh, String dienThoai, long cmnd,
			String email, String diachi, Set<NhapXe> nhapXes, Set<DatXe> datXes) {
		this.quyen = quyen;
		this.userName = userName;
		this.password = password;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.dienThoai = dienThoai;
		this.cmnd = cmnd;
		this.email = email;
		this.diachi = diachi;
		this.nhapXes = nhapXes;
		this.datXes = datXes;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Quyen getQuyen() {
		return this.quyen;
	}

	public void setQuyen(Quyen quyen) {
		this.quyen = quyen;
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

	public Set<NhapXe> getNhapXes() {
		return this.nhapXes;
	}

	public void setNhapXes(Set<NhapXe> nhapXes) {
		this.nhapXes = nhapXes;
	}

	public Set<DatXe> getDatXes() {
		return this.datXes;
	}

	public void setDatXes(Set<DatXe> datXes) {
		this.datXes = datXes;
	}

}
