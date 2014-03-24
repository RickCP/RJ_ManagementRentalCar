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
@Table(name = "dm_quyen")
public class DmQuyen implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "dm_quyen_id")
	private Integer dmQuyenId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quyen_id")
	private Quyen quyen;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quanli_id")
	private User user;

	@Column(name = "ngay_bat_dau")
	private Date ngayBatDau;

	@Column(name = "ngay_ket_thuc")
	private Date ngayKetThuc;

	@Column(name = "trang_thai")
	private boolean trangThai;

	public DmQuyen() {
	}

	public DmQuyen(Quyen quyen, User user, boolean trangThai) {
		this.quyen = quyen;
		this.user = user;
		this.trangThai = trangThai;
	}

	public DmQuyen(Quyen quyen, User user, Date ngayBatDau, Date ngayKetThuc,
			boolean trangThai) {
		this.quyen = quyen;
		this.user = user;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.trangThai = trangThai;
	}

	public Integer getDmQuyenId() {
		return this.dmQuyenId;
	}

	public void setDmQuyenId(Integer dmQuyenId) {
		this.dmQuyenId = dmQuyenId;
	}

	public Quyen getQuyen() {
		return this.quyen;
	}

	public void setQuyen(Quyen quyen) {
		this.quyen = quyen;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getNgayBatDau() {
		return this.ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Date getNgayKetThuc() {
		return this.ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public boolean isTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

}
