/**
 * UserDaoImpl.java
 * com.ry.ssm.dao.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017年12月25日 		Administrator
 *
 * Copyright (c) 2017, TNT All Rights Reserved.
*/

package com.ry.ssm.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ry.ssm.dao.IUserDao;
import com.ry.ssm.entity.E_User;

/**
 * ClassName:UserDaoImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年12月25日		下午4:19:45
 *
 * @see 	 
 *  
 */
@Repository
public class UserDaoImpl implements IUserDao {
	private int i=0;
	private boolean flag=false;
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public boolean user_register(E_User e_User) {
		i=this.sqlSessionTemplate.insert("e_userMapper.register",e_User);
		System.out.println(i);
		if(i==1){
			flag=true;
		}
		return flag;
		
	}

}

