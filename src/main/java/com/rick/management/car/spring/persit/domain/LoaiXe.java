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
@Table(name = "loai_xe")
public class LoaiXe implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "loai_xe_id")
	private Integer loaiXeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hang_xe_id")
	private HangXe hangXe;

	@Column(name = "ten_loai_xe")
	private String tenLoaiXe;

	@Column(name = "so_cho")
	private Integer soCho;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "loaiXe")
	private List<DmXe> dmXes;

	public LoaiXe() {
	}

	public LoaiXe(HangXe hangXe, String tenLoaiXe, Integer soCho, List<DmXe> dmXes) {
		this.hangXe = hangXe;
		this.tenLoaiXe = tenLoaiXe;
		this.soCho = soCho;
		this.dmXes = dmXes;
	}

	public Integer getLoaiXeId() {
		return this.loaiXeId;
	}

	public void setLoaiXeId(Integer loaiXeId) {
		this.loaiXeId = loaiXeId;
	}

	public HangXe getHangXe() {
		return this.hangXe;
	}

	public void setHangXe(HangXe hangXe) {
		this.hangXe = hangXe;
	}

	public String getTenLoaiXe() {
		return this.tenLoaiXe;
	}

	public void setTenLoaiXe(String tenLoaiXe) {
		this.tenLoaiXe = tenLoaiXe;
	}

	public Integer getSoCho() {
		return this.soCho;
	}

	public void setSoCho(Integer soCho) {
		this.soCho = soCho;
	}

	public List<DmXe> getDmXes() {
		return this.dmXes;
	}

	public void setDmXes(List<DmXe> dmXes) {
		this.dmXes = dmXes;
	}

}
