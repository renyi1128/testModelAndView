/**
 * User.java
 * com.ry.springmvc.entity
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017年12月22日 		Administrator
 *
 * Copyright (c) 2017, TNT All Rights Reserved.
*/

package com.ry.springmvc.entity;
/**
 * ClassName:User
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年12月22日		上午10:02:16
 *
 * @see 	 
 *  
 */
public class User {
	private Integer id;
	private String username;
	private String password;
	private Card card;
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
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", card=" + card + "]";
	}
	

}

