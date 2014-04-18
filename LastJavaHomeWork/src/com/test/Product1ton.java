package com.test;

public class Product1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int low=1;
		int high=10;
		int product=1;
		
		for(x=low; x<=high; x++){
			product=product*x;
			
		}

		System.out.println("product is:"+product);
	}

}
