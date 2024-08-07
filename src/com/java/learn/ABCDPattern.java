package com.java.learn;

public class ABCDPattern {

	public static void main(String[] args) {

        int n=5;	
        playPattern(n);
	}

	private static void playPattern(int n) {

		
		if(n==1)
		{
			System.out.println("A");
		}
		for(int i=0;i<(2*n)-1;i++)
		{
			for(int j=0;j<(2*n)-1;j++)
			{
				if(j<=i && i<n && j<n)
				{
					System.out.print((char)('A'+j));
				}
				else if(j>i && j<n)
				{
					System.out.print(" ");
				}
				else if(j>=n && i<n)
				{ 
					if(j+i>=(2*n)-2 && i!=j)
					{
						System.out.print((char)('A'+((2*n-2)-j)));
					}
					else
					{
						System.out.print(" ");
					}
				}
				if(i>=n)
				{
					if(i+j<=(2*n-2) && j<n)
					{
						System.out.print((char)('a'+j));
					}
					else if(i+j>(2*n-2) && j<n)
					{
						System.out.print(" ");
					}
					else if(j>=n)
					{ 
						if(j>=i)
						{
							System.out.print((char)('a'+((2*n-2)-j)));
						}
						else
						{
							System.out.print(" ");
						}
					}
					
				}
			}
			System.out.println();
		}

	}

}
