package Mani;
import java.util.Arrays;
import java.util.List;

public class New {
	 public static void main(String[] args)
	 {
		 String s = "MCMXCIV";
		 Solution.romanToInt(s);
		 
	 }
	 
}
class Solution {
    public static int romanToInt(String s) {
	   char array[] = new char[s.length()+1];
	   for(int i =0;i<s.length();i++)
		    array[i] = s.charAt(i);
	   List arr = Arrays.asList("IV","IX","XL","XC","CD","CM");
	   int i=0, j=1;
	   int sum=0;
	   while(i<s.length()) {
		   String b = String.valueOf(array[i])+String.valueOf(array[j]);
		   System.out.println("String: "+b);
		   int k;
				   for(k=0;k<arr.size();k++) {
					   
					   if(arr.get(k).equals(b)) {
						 
						   if(b.equals("IV")) {
						      sum+=4;
						      i+=2; j+=2; 
						      break;
						   }
						   else if(b.equals("IX")) {
							  
							   sum+=9;
							   i+=2; j+=2; 
						       break;
						   }
						   else if(b.equals("XL")){
							   sum+=40;
							   i+=2; j+=2; 
						       break;
						   }
							   
						   else if(b.equals("XC")){
							   sum+=90;
							   i+=2; j+=2; 
						       break;
						   }
							   
						   else if(b.equals("CD")){
							   sum+=400;
							   i+=2; j+=2; 
						       break;
						   }
						   if(b.equals("CM")){
							   sum+=900;
							   i+=2; j+=2; 
						       break;
						   }
						   
						  
						 
					   }
				   }
				 
				   if(k==arr.size()) {
                  
					   if(array[i] == 'I') {
						      sum+=1; 
						    
					   }
					   else if(array[i] == 'V') {
						      sum+=5;
						      }
					   else if(array[i] == 'X') {
						      sum+=10;
						    
					   }
					   else if(array[i] == 'L') {
						      sum+=50;
						  
					   }
					   else if(array[i] == 'C') {
						      sum+=100;
						      System.out.println("ce");
						   
					   }
					   else if(array[i] == 'D') {
						      sum+=500;
						    
					   }
					   else if(array[i] == 'M') {
						      sum+=1000;
						  
					   }
					   i+=1; j+=1;
					  
				   }
				  
	   }
		  
		  
	   return sum;
    	
        
    }
}
