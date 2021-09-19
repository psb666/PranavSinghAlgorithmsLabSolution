package com.notecounter.model;

import java.util.Scanner;

public class MinNotes {
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("How many denominations?");
		
		int size= scan.nextInt();
		int[] notes=new int[size];
		int[] numNotes=new int[size];
		System.out.println("Enter the currncy denominations value: ");
		
		for(int i=0;i<size;i++) {
			notes[i]=scan.nextInt();
		}
		MergeSortImplementation obj = new MergeSortImplementation();
		obj.sort(notes, 0, notes.length-1);
		
		for(int i=0;i<size;i++) {
			
			System.out.println(notes[i]);
		}
		System.out.println("What is the amount to pay?");
		int amount=scan.nextInt();
		
		for(int i=0;i<notes.length;i++) {
			int n=(int) (amount/notes[i]);
			numNotes[i]=n;
			//System.out.println(notes[i]+" : "+n);
			
			amount=amount-(n*notes[i]);
			
			if(i==notes.length-1 && amount!=0) {
				System.out.println("Amount not possible to pay.");
				}
			else if(i==notes.length-1 && amount==0) {
				for(int j=0;j<numNotes.length;j++) {
					System.out.println(notes[j]+" : "+numNotes[j]);
				}
			}
				
		}
	}
}

