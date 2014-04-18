package com.test;

public class HarmoniSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double denominator=1;
		double sumR2L=0.0;
		double sumL2R=0;
		double maxdeno=200;
		
		for(denominator=1; denominator<=maxdeno; denominator++){
			
			sumL2R+=(1/denominator);
		}
		System.out.println("Sum from left to right is:"+sumL2R);

		for(denominator=maxdeno; denominator>=1; denominator--){
			
			sumL2R+=(1/denominator);
		}
		
		
		System.out.println("Sum from right to left is:"+sumR2L);
		

	}

}
