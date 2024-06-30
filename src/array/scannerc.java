package array;

import java.util.Scanner;

public class scannerc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner (System.in);
	        System.out.println("enter the row size");
	        int row=in.nextInt();
	        System.out.println("enter the row size");
	        int col=in.nextInt();
	         int ar[][]=new int [row][col];
	        System.out.println("enter the values :");
	        for(int i=0;i<row;i++) {
	        	for(int j=0;i<col;i++) {
	        		ar[i][j]=in.nextInt();
	        	}
	        }
	      //  System.out.println(" the values :");  
	        for(int i=0;i<row;i++) {
	        	for(int j=0;i<col;i++) {
	        		System.out.println(ar[i][j]+" ");
	        	}
	        	System.out.println();
	}

	}}
