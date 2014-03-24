package com.rick.management.car.spring.persit.domain;

// Generated Mar 24, 2014 3:02:09 PM by Hibernate Tools 4.0.0

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

/**
 * DmXe generated by hbm2java
 */
@Entity
@Table(name = "dm_xe", catalog = "management_rental_car")
public class DmXe implements java.io.Serializable {

	private Integer dmXeId;
	private LoaiXe loaiXe;
	private String tenXe;
	private Integer tongSoLuong;
	private Integer soLuongThue;
	private Double giaThueXe;
	private String hinhAnh;
	private String thongTin;
	private Set<ChiTietDatXe> chiTietDatXes = new HashSet<ChiTietDatXe>(0);
	private Set<ChiTietNhapXe> chiTietNhapXes = new HashSet<ChiTietNhapXe>(0);

	public DmXe() {
	}

	public DmXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public DmXe(LoaiXe loaiXe, String tenXe, Integer tongSoLuong,
			Integer soLuongThue, Double giaThueXe, String hinhAnh,
			String thongTin, Set<ChiTietDatXe> chiTietDatXes,
			Set<ChiTietNhapXe> chiTietNhapXes) {
		this.loaiXe = loaiXe;
		this.tenXe = tenXe;
		this.tongSoLuong = tongSoLuong;
		this.soLuongThue = soLuongThue;
		this.giaThueXe = giaThueXe;
		this.hinhAnh = hinhAnh;
		this.thongTin = thongTin;
		this.chiTietDatXes = chiTietDatXes;
		this.chiTietNhapXes = chiTietNhapXes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "dm_xe_id", unique = true, nullable = false)
	public Integer getDmXeId() {
		return this.dmXeId;
	}

	public void setDmXeId(Integer dmXeId) {
		this.dmXeId = dmXeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loai_xe_id")
	public LoaiXe getLoaiXe() {
		return this.loaiXe;
	}

	public void setLoaiXe(LoaiXe loaiXe) {
		this.loaiXe = loaiXe;
	}

	@Column(name = "ten_xe", nullable = false, length = 50)
	public String getTenXe() {
		return this.tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	@Column(name = "tong_so_luong")
	public Integer getTongSoLuong() {
		return this.tongSoLuong;
	}

	public void setTongSoLuong(Integer tongSoLuong) {
		this.tongSoLuong = tongSoLuong;
	}

	@Column(name = "so_luong_thue")
	public Integer getSoLuongThue() {
		return this.soLuongThue;
	}

	public void setSoLuongThue(Integer soLuongThue) {
		this.soLuongThue = soLuongThue;
	}

	@Column(name = "gia_thue_xe", precision = 22, scale = 0)
	public Double getGiaThueXe() {
		return this.giaThueXe;
	}

	public void setGiaThueXe(Double giaThueXe) {
		this.giaThueXe = giaThueXe;
	}

	@Column(name = "hinh_anh", length = 100)
	public String getHinhAnh() {
		return this.hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	@Column(name = "thong_tin")
	public String getThongTin() {
		return this.thongTin;
	}

	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dmXe")
	public Set<ChiTietDatXe> getChiTietDatXes() {
		return this.chiTietDatXes;
	}

	public void setChiTietDatXes(Set<ChiTietDatXe> chiTietDatXes) {
		this.chiTietDatXes = chiTietDatXes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dmXe")
	public Set<ChiTietNhapXe> getChiTietNhapXes() {
		return this.chiTietNhapXes;
	}

	public void setChiTietNhapXes(Set<ChiTietNhapXe> chiTietNhapXes) {
		this.chiTietNhapXes = chiTietNhapXes;
	}

}
