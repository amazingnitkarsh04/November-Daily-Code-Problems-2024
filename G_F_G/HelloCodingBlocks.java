package com.que1;


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class HelloCodingBlocks {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc =new Scanner(System.in);
	        int n=sc.nextInt();
	        sc.nextLine();
	        
	        for(int i=0;i<n;i++){
	            String name= sc.nextLine();
	            

	         
	                int p=sc.nextInt();
	                int c=sc.nextInt();
	                int m=sc.nextInt();
	                 sc.nextLine();
	                System.out.println(name+":"+((p+c+m)/3));
	            }
	           
				
	        }
	        
	        
	    }
	
	


