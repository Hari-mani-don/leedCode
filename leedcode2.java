//Given an integer x, return true if x is a palindrome , and false otherwise.

class Solution {
    public static boolean isPalindrome(int x) {
    	if(x<0) {
    		return false;
    	}
    	int temp =x;
    	int reverseNum = 0;
    	int sum =0;
    	while(temp!=0) {
    		sum=temp%10;
    		reverseNum = (reverseNum * 10) + sum;
    		temp/=10;
    	}
       return reverseNum == x;
    }
}
