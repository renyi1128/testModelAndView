/**
 * E_User.java
 * com.ry.ssm.entity
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017年12月25日 		Administrator
 *
 * Copyright (c) 2017, TNT All Rights Reserved.
*/

package com.ry.ssm.entity;
/**
 * ClassName:E_User
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年12月25日		下午4:20:41
 *
 * @see 	 
 *  
 */
public class E_User {
	private Integer id;
	private String username;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "E_User [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}
	public E_User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public E_User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public E_User() {
		super();
	}
	

}

