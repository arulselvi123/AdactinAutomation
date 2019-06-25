package com.java.prog;

import java.util.Scanner;

public class GSTCal {

	    	    public static void main( String[] args )
	    	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Verify the Total Price excl GST");
	    	int price=sc.nextInt();
	    	int nroom=sc.nextInt();
	    	int nday=sc.nextInt();
	    	int totalprice= price * nroom * nday;
	    	System.out.println("Total Price is"+totalprice); 
	    	//int GST=sc.nextInt();
	    	int GSTPercentage= (price * 10)/100;
	    	System.out.println("GST 10%" +GSTPercentage);
	    	int GSTprice=GSTPercentage + totalprice; 
	    	System.out.println("Total Price with GST"+GSTprice); 
	    	

	    	}
	    	}  

