package com.oracle.excercise.week1;

public class ShopApp {

	public static final double MIN= 0.0;
	public static void main(String[] args) {

		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();

		item1.description = "Blue Jacket";
		item1.price = 20.9;
		item1.size = "M";

		System.out.println();
		
		Customer cust = new Customer();
		cust.size="S";
		cust.name="Pinky";
		
		int measuerment =3;
		
		switch (measuerment) {
		
		case 1: case 2:
			cust.size="S";
		
		case 4:
			cust.size="M";
		}
		
		int[] arr = {};
		Clothing[] clothingArray = {item1, item2};
	}
}
