package com.test;

public class SumofSevenDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		double avg=0;
		double up=100;
		double low=0;
		double x;
		
		for(x=low; x<=up; x++){
			sum+=(x%7);
			avg=(sum/(x%7));
			
		}
		System.out.println("the sum is:"+sum);
		System.out.println("the avg is:"+avg);
		
		

	}

}
