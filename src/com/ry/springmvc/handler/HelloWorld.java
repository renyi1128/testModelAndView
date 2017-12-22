/**
 * HelloWorld.java
 * com.ry.springmvc.handler
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017年12月21日 		Administrator
 *
 * Copyright (c) 2017, TNT All Rights Reserved.
*/

package com.ry.springmvc.handler;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ry.springmvc.entity.User;


/**
 * ClassName:HelloWorld
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年12月21日		下午3:46:42
 *
 * @see 	 
 *  
 */
@Controller
@RequestMapping("qingqiu2")
@SessionAttributes({"name1"})
public class HelloWorld {
	private static  String SUCCESS="bbb";
	@RequestMapping(value="/qingqiu1",method=RequestMethod.GET)
	public ModelAndView  hello1() {
		String viewName=SUCCESS;
		ModelAndView modelAndView = new ModelAndView(viewName);
		modelAndView.addObject("aaa","xiaochenchen");
		return modelAndView;
	}
	
	@RequestMapping(value="/qingqiu3",method=RequestMethod.GET)
	public String hello2(Map<String, Object> map){
		map.put("name1",new User());
		map.put("name2","huahua");
		return "bbb";
	}
}

