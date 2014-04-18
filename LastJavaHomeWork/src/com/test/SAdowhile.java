package com.test;

public class SAdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;
		int sum=0;
		double avg=0;
		double up=100;
		double low=0;
		
		do {
			sum+=x;
			x++;
			avg=sum/up;
		}
		
		while (x<=up);
		System.out.println("Sum:"+sum);
		System.out.println("Avg:"+avg);
			

	}

}
