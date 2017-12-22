/**
 * Card.java
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
 * ClassName:Card
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年12月22日		上午10:03:54
 *
 * @see 	 
 *  
 */
public class Card {
	private String idcard;

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	@Override
	public String toString() {
		return "Card [idcard=" + idcard + "]";
	}
	

}

