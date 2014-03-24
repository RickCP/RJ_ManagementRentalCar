package com.rick.management.car.spring.persit.domain;

import java.util.List;

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
@Table(name = "dm_xe")
public class DmXe implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "dm_xe_id")
	private Integer dmXeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loai_xe_id")
	private LoaiXe loaiXe;

	@Column(name = "ten_xe")
	private String tenXe;

	@Column(name = "tong_so_luong")
	private Integer tongSoLuong;

	@Column(name = "so_luong_thue")
	private Integer soLuongThue;

	@Column(name = "gia_thue_xe")
	private Double giaThueXe;

	@Column(name = "hinh_anh")
	private String hinhAnh;

	@Column(name = "thong_tin")
	private String thongTin;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dmXe")
	private List<ChiTietDatXe> chiTietDatXes;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dmXe")
	private List<ChiTietNhapXe> chiTietNhapXes;

	public DmXe() {
	}

	public DmXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public DmXe(LoaiXe loaiXe, String tenXe, Integer tongSoLuong, Integer soLuongThue, Double giaThueXe,
			String hinhAnh, String thongTin, List<ChiTietDatXe> chiTietDatXes,
			List<ChiTietNhapXe> chiTietNhapXes) {
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

	public Integer getDmXeId() {
		return this.dmXeId;
	}

	public void setDmXeId(Integer dmXeId) {
		this.dmXeId = dmXeId;
	}

	public LoaiXe getLoaiXe() {
		return this.loaiXe;
	}

	public void setLoaiXe(LoaiXe loaiXe) {
		this.loaiXe = loaiXe;
	}

	public String getTenXe() {
		return this.tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public Integer getTongSoLuong() {
		return this.tongSoLuong;
	}

	public void setTongSoLuong(Integer tongSoLuong) {
		this.tongSoLuong = tongSoLuong;
	}

	public Integer getSoLuongThue() {
		return this.soLuongThue;
	}

	public void setSoLuongThue(Integer soLuongThue) {
		this.soLuongThue = soLuongThue;
	}

	public Double getGiaThueXe() {
		return this.giaThueXe;
	}

	public void setGiaThueXe(Double giaThueXe) {
		this.giaThueXe = giaThueXe;
	}

	public String getHinhAnh() {
		return this.hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getThongTin() {
		return this.thongTin;
	}

	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}

	public List<ChiTietDatXe> getChiTietDatXes() {
		return this.chiTietDatXes;
	}

	public void setChiTietDatXes(List<ChiTietDatXe> chiTietDatXes) {
		this.chiTietDatXes = chiTietDatXes;
	}

	public List<ChiTietNhapXe> getChiTietNhapXes() {
		return this.chiTietNhapXes;
	}

	public void setChiTietNhapXes(List<ChiTietNhapXe> chiTietNhapXes) {
		this.chiTietNhapXes = chiTietNhapXes;
	}

}
