package com.test;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int x;
		double avg=0;
		int lowerbound=1;
		int upperbound=100;
		
		for(x=lowerbound; x<=upperbound; x++){
			
			sum+=x;
			avg=sum/upperbound;
		}
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+avg);

			
		}
	
	}

