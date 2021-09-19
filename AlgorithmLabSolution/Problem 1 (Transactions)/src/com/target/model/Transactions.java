package com.target.model;

import java.util.Scanner;

public class Transactions {
	
	public static int size;
	public static int array[];
	public static int num;
	
	
		static Scanner scan=new Scanner(System.in);
	
	public void keyInput() {
		System.out.println("Enter the size of transaction array: ");
		size=scan.nextInt();
		array = new int[size];
		insertValues();
		
		System.out.println("Enter the total number of targets thats need to be achieved: ");
		num=scan.nextInt();
		
		for (int i=0;i<num;i++) {
			System.out.println("Enter the target: ");
			int target= scan.nextInt();
		
		int sum=0;
		for (int j=0;j<array.length;j++) {
			sum=sum+array[j];
			
			if(sum>=target) {
				System.out.println("Target is reached after "+(j+1)+" transactions");
				break;
				}
			if (j==array.length -1 && sum<target) {
				System.out.println("Target is not achieved");
				
				}
			}
		}
	}
	
	public void insertValues() {
		for(int i = 0;i<size;i++){
			System.out.println("Enter transaction value "+(i+1)+" : ");
			array[i]=scan.nextInt();
		}
	}

}
