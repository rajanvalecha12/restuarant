package com.training.domains;

public class Menu {
	private int menuCode;
	private String item;
	private String category;
	private int price;
	private int quantity;
	public Menu(int menuCode, String item, String category, int price, int quantity) {
		super();
		this.menuCode = menuCode;
		this.item = item;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Menu(int menuCode, String item, String category, int price) {
		super();
		this.menuCode = menuCode;
		this.item = item;
		this.category = category;
		this.price = price;
	}

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(int menuCode) {
		this.menuCode = menuCode;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Menu [menuCode=" + menuCode + "\t item=" + item + "\t category=" + category + "\t price=" + price
				+ "\t quantity=" + quantity + "]\n";
	}
	
}
