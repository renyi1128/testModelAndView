/**
 * UserHandler.java
 * com.ry.ssm.handler
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017年12月25日 		Administrator
 *
 * Copyright (c) 2017, TNT All Rights Reserved.
*/

package com.ry.ssm.handler;

import java.net.Authenticator.RequestorType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ry.ssm.entity.E_User;
import com.ry.ssm.service.IUserService;

/**
 * ClassName:UserHandler
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年12月25日		下午6:30:32
 *
 * @see 	 
 *  
 */
@Controller
@RequestMapping("ssm")
public class UserHandler {
	//注入service
	@Autowired
	IUserService iUserService;
	
	@RequestMapping("/register")
	public String userHandler(E_User e_User){
		System.out.println(e_User.getUsername());
		iUserService.user_register(e_User);
		return "redirect:/login.jsp";
	}

}

