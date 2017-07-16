package com.kongzhu.demo.springmvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 处理应用中 home 页面的请求
 */
@Controller
public class HomeController {
	
	/**
	 * 通过返回视图名称来简单选择要展示的 home 视图
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	    System.out.printf("Welcome home! The client locale is %s.\n", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate);
		
		return "home";
	}
	
}
