package com.test;

public class SumOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;
		int sum=0;
		int up=100;
		int low=0;
		
		for(x= low; x<=up; x++){
			sum+=(x*x);
			
		}
		System.out.println("Square Sum:"+sum);

	}

}
