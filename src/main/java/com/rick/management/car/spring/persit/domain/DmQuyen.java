package com.rick.management.car.spring.persit.domain;

// Generated Mar 24, 2014 3:02:09 PM by Hibernate Tools 4.0.0

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DmQuyen generated by hbm2java
 */
@Entity
@Table(name = "dm_quyen", catalog = "management_rental_car")
public class DmQuyen implements java.io.Serializable {

	private Integer dmQuyenId;
	private Quyen quyen;
	private User user;
	private Date ngayBatDau;
	private Date ngayKetThuc;
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

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "dm_quyen_id", unique = true, nullable = false)
	public Integer getDmQuyenId() {
		return this.dmQuyenId;
	}

	public void setDmQuyenId(Integer dmQuyenId) {
		this.dmQuyenId = dmQuyenId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quyen_id", nullable = false)
	public Quyen getQuyen() {
		return this.quyen;
	}

	public void setQuyen(Quyen quyen) {
		this.quyen = quyen;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quanli_id", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ngay_bat_dau", length = 19)
	public Date getNgayBatDau() {
		return this.ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ngay_ket_thuc", length = 19)
	public Date getNgayKetThuc() {
		return this.ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	@Column(name = "trang thai", nullable = false)
	public boolean isTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

}