package com.rick.management.car.spring.web.bean;

import javax.validation.constraints.NotNull;



/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public class LoaiXeUI {
	private Integer loaiXeId;
	@NotNull
	private String tenhangXe;
	@NotNull
	private String tenLoaiXe;
	@NotNull
	private Integer soCho;
	public Integer getLoaiXeId() {
		return loaiXeId;
	}
	public void setLoaiXeId(Integer loaiXeId) {
		this.loaiXeId = loaiXeId;
	}
	public String getTenhangXe() {
		return tenhangXe;
	}
	public void setTenhangXe(String tenhangXe) {
		this.tenhangXe = tenhangXe;
	}
	public String getTenLoaiXe() {
		return tenLoaiXe;
	}
	public void setTenLoaiXe(String tenLoaiXe) {
		this.tenLoaiXe = tenLoaiXe;
	}
	public Integer getSoCho() {
		return soCho;
	}
	public void setSoCho(Integer soCho) {
		this.soCho = soCho;
	}
	
}
