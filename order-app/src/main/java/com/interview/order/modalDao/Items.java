package com.interview.order.modalDao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Items {
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer itemId;
	  @Column(name = "itemName")
	  	private String itemName;
	  @Column(name = "itemUnitPrice")
	  	private double itemUnitPrice;
	  @Column(name = "itemQuantity")
	  	private int itemQuantity;
		public Integer getItemId() {
			return itemId;
		}
		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public double getItemUnitPrice() {
			return itemUnitPrice;
		}
		public void setItemUnitPrice(double itemUnitPrice) {
			this.itemUnitPrice = itemUnitPrice;
		}
		public int getItemQuantity() {
			return itemQuantity;
		}
		public void setItemQuantity(int itemQuantity) {
			this.itemQuantity = itemQuantity;
		}
		@Override
		public String toString() {
			return "Items [itemId=" + itemId + ", itemName=" + itemName + ", itemUnitPrice=" + itemUnitPrice
					+ ", itemQuantity=" + itemQuantity + "]";
		}
	  
	  	
}
