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
			for(int j=0;j<(2*n);j++)
			{
				// print upper right side
				if(j<=i && i<n && j<n)
				{
					System.out.print((char)('A'+j));
				}
				// print upper right side spaces
				else if(j>i && j<n)
				{
					System.out.print(" ");
				}
				// print upper left side
				else if(j>=n && i<n)
				{ 
					// print upper left side
					if(j+i>=(2*n)-1)
					{
						System.out.print((char)('A'+((2*n-1)-j)));
					}
					// print upper left side spaces
					else
					{
						System.out.print(" ");
					}
				}
				if(i>=n)
				{
					// print bottom left side characters
					if(i+j<=(2*n-2) && j<n)
					{
						System.out.print((char)('a'+j));
					}
					// print bottom left side spaces
					else if(i+j>(2*n-2) && j<=n)
					{
						System.out.print(" ");
					}
					// print bottom right side char plus spaces
					else if(j>n)
					{ 
						if(j>i)
						{
							System.out.print((char)('a'+((2*n-1)-j)));
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
