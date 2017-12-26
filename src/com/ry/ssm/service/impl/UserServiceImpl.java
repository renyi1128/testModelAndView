/**
 * UserServiceImpl.java
 * com.ry.ssm.service.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017年12月25日 		Administrator
 *
 * Copyright (c) 2017, TNT All Rights Reserved.
*/

package com.ry.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ry.ssm.dao.IUserDao;
import com.ry.ssm.entity.E_User;
import com.ry.ssm.service.IUserService;

/**
 * ClassName:UserServiceImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年12月25日		下午6:27:14
 *
 * @see 	 
 *  
 */
@Service
public class UserServiceImpl implements IUserService {
	//注入DAO
	@Autowired
	IUserDao iUserDao;

	@Override
	@Transactional
	public boolean user_register(E_User e_User) {
		return iUserDao.user_register(e_User);
	}

}

