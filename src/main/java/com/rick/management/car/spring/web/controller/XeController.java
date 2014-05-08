package com.rick.management.car.spring.web.controller;

import java.security.Principal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rick.management.car.spring.constant.WebConstants;
import com.rick.management.car.spring.persit.domain.ChiTietDatXe;
import com.rick.management.car.spring.persit.domain.DatXe;
import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.service.IChiTietDatXeService;
import com.rick.management.car.spring.service.IDMXeService;
import com.rick.management.car.spring.service.IDatXeService;
import com.rick.management.car.spring.web.bean.DatXeUI;
import com.rick.management.car.spring.web.common.SecurityUtil;
import com.rick.management.car.spring.web.common.StringUtil;
import com.rick.management.car.spring.web.mapper.DatXeMapper;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
@Controller
public class XeController {
	public static final String[] PATTERN_DATE = { "dd/mm/yy" };
	@Autowired
	private IDMXeService dMXeService;
	@Autowired
	private IDatXeService datXeService;
	@Autowired
	private IChiTietDatXeService cTDXService;

	@RequestMapping(value = "/datthue", method = RequestMethod.GET)
	public String getDatThueXe(Principal principal, Model model, Integer dmXeId) {
		DatXeUI datXeUI = new DatXeUI();
		List<Integer> soluongUI = new ArrayList<Integer>();
		if (principal != null) {
			if (dmXeId != null) {
				DmXe existingDmxe = dMXeService.findBydmXeId(dmXeId);

				if (existingDmxe != null) {
					Integer soluongCon = StringUtil.getIntValue(existingDmxe
							.getTongSoLuong())
							- StringUtil.getIntValue(existingDmxe
									.getSoLuongThue());
					if (soluongCon > 0) {
						for (int i = 1; i <= soluongCon; i++) {
							soluongUI.add(i);
						}
						datXeUI.setDmXeId(existingDmxe.getDmXeId());
						datXeUI.setSoTien(existingDmxe.getGiaThueXe()
								.toString());
						model.addAttribute("datXeUI", datXeUI);
						model.addAttribute("sls", soluongUI);
					}
					else
					{
						model.addAttribute("errors","Hiện tại công ty đã cho thuê hết xe này.");
						return WebConstants.Views.ERROR_PAGE;
					}
				}

			}

			return WebConstants.Views.DAT_THUE;
		} else {
			return "redirect:/register";
		}
	}

	@RequestMapping(value = "/datthue", method = RequestMethod.POST)
	public String postDatThueXe(Model model, DatXeUI ui) {
		User user = SecurityUtil.getCurrentUser();
		DmXe existingDmXe = dMXeService.findBydmXeId(ui.getDmXeId());
		if (user != null) {
			DatXe xeSaved = DatXeMapper.convertToEntity(ui, user, existingDmXe);
			ChiTietDatXe cTDX = new ChiTietDatXe();
			if (xeSaved != null) {
				cTDX.setDatXe(xeSaved);
				cTDX.setDmXe(existingDmXe);
				try {
					cTDX.setNgayThue(DateUtils.parseDate(ui.getNgayThue(),
							PATTERN_DATE));
					cTDX.setNgayTra(DateUtils.parseDate(ui.getNgayTra(),
							PATTERN_DATE));

				} catch (ParseException e) {
					e.printStackTrace();
				}
				cTDX.setSoLuong(StringUtil.getIntValue(ui.getSoLuong()));
				cTDX.setSoTien(StringUtil.geDoubleValue(ui.getSoTien()));
				cTDX.setTinhTrang(ui.getTinhTrang());
				datXeService.create(xeSaved);
				cTDXService.create(cTDX);
				if (ui.getSoLuong() != null || !ui.getSoLuong().equals(""))
					existingDmXe.setSoLuongThue(StringUtil.getIntValue(ui
							.getSoLuong())
							+ StringUtil.getIntValue(existingDmXe
									.getSoLuongThue()));
				dMXeService.saveOrUpdate(existingDmXe);

			}

		}
		return "redirect:/";
	}
	
	
}
