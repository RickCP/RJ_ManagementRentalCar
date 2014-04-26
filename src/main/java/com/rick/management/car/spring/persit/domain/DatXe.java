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
@Table(name = "dat_xe")
public class DatXe implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "dat_xe_id")
	private Integer datXeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@Column(name = "ngay_dat_thue")
	private Date ngayDatThue;

	@Column(name = "lien_he")
	private String lienHe;

	@Column(name = "tong_so_tien")
	private Double tongSoTien;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "datXe")
	private Set<ChiTietDatXe> chiTietDatXes = new HashSet<ChiTietDatXe>(0);

	public DatXe() {
	}

	public DatXe(User user) {
		this.user = user;
	}

	public DatXe(User user, Date ngayDatThue, String lienHe, Double tongSoTien,
			Set<ChiTietDatXe> chiTietDatXes) {
		this.user = user;
		this.ngayDatThue = ngayDatThue;
		this.lienHe = lienHe;
		this.tongSoTien = tongSoTien;
		this.chiTietDatXes = chiTietDatXes;
	}

	public Integer getDatXeId() {
		return this.datXeId;
	}

	public void setDatXeId(Integer datXeId) {
		this.datXeId = datXeId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getNgayDatThue() {
		return this.ngayDatThue;
	}

	public void setNgayDatThue(Date ngayDatThue) {
		this.ngayDatThue = ngayDatThue;
	}

	public String getLienHe() {
		return this.lienHe;
	}

	public void setLienHe(String lienHe) {
		this.lienHe = lienHe;
	}

	public Double getTongSoTien() {
		return this.tongSoTien;
	}

	public void setTongSoTien(Double tongSoTien) {
		this.tongSoTien = tongSoTien;
	}

	public Set<ChiTietDatXe> getChiTietDatXes() {
		return this.chiTietDatXes;
	}

	public void setChiTietDatXes(Set<ChiTietDatXe> chiTietDatXes) {
		this.chiTietDatXes = chiTietDatXes;
	}

}
