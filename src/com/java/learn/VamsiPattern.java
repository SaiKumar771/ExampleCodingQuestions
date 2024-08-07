package com.java.learn;

public class VamsiPattern {

	public static void main(String[] args) {
		int n=4;
		 for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print((char)(64+j)+" ");
	            }
	            for(int j=i;j<n;j++)
	            {
	                System.out.print("  ");
	            }
	            for(int j=i;j<n;j++)
	            {
	                System.out.print("  ");
	            }
	            for(int j=i;j>=1;j--)
	            {
	                System.out.print((char)(64+j)+" ");
	            }
	            System.out.println();
	        }
		 for(int i=n-1;i>=1;i--)
	        {
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print((char)(96+j)+" ");
	            }
	            for(int j=i;j<n;j++)
	            {
	                System.out.print("  ");
	            }
	            for(int j=i;j<n;j++)
	            {
	                System.out.print("  ");
	            }
	            for(int j=i;j>=1;j--)
	            {
	                System.out.print((char)(96+j)+" ");
	            }
	            System.out.println();
	        }
		 
	}

}
