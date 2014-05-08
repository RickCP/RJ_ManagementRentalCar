package com.rick.management.car.spring.web.bean;

import javax.validation.constraints.NotNull;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
public class HangXeUI {
	private Integer hangXeId;
	@NotNull
	private String tenHangXe;

	public Integer getHangXeId() {
		return hangXeId;
	}

	public void setHangXeId(Integer hangXeId) {
		this.hangXeId = hangXeId;
	}

	public String getTenHangXe() {
		return tenHangXe;
	}

	public void setTenHangXe(String tenHangXe) {
		this.tenHangXe = tenHangXe;
	}

}
