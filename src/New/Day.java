package New;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		 int n, sumE = 0, sumO = 0,evencount=0,oddcount=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number of elements in array:");
	        n = s.nextInt();
	        int[] a = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        for(int i = 0; i < n; i++)
	        {
	            if(a[i] % 2 == 0)
	            {
	                sumE = sumE + a[i];
	                evencount++;
	            }
	            else
	            {
	                sumO = sumO + a[i];
	                oddcount++;
	            }
	        }
	        System.out.println("Sum of Even Numbers:"+sumE);
	        System.out.println("Sum of Odd Numbers:"+sumO);
	        
	        evencount =sumE/evencount;
	    	oddcount= sumO/oddcount;
	    	System.out.println("average Even:"+evencount);
	    	System.out.println("average Odd:"+oddcount);
	    	s.close();
	}

}
