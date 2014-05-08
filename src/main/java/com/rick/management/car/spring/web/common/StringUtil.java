package com.rick.management.car.spring.web.common;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;


/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public class StringUtil {
	public static long getLongValue(Object obj) {
		try {
			if (obj != null) {
				return Long.parseLong(obj.toString().trim());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public static Double geDoubleValue(Object obj) {
		try {
			if (obj != null) {
				return Double.parseDouble(obj.toString().trim());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0.0;
	}
	public static int getIntValue(Object obj) {
		try {
			if (obj != null) {
				return Integer.parseInt(obj.toString().trim());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public static String convertToString(Object object) {
		if(object==null) {
			return null;
		}
		String data = null;
		if(object instanceof String) {
			data = (String) object;
		} else {
			try {
				data = ToStringBuilder.reflectionToString(object);
			} catch (Exception e) {
				data = object.toString();
			}
		}
		return data;
	}
	public static String convertDateTimeToString(Date date)
	{
		Format formatter = new SimpleDateFormat("dd/MM/yy");
		String string = formatter.format(date);
		return string;
	}

}
