package org.unitTest.assignment.UnitTesting;

public class StringUtils {

	 public String reverse(String input) {	 
		 return new StringBuilder(input).reverse().toString();
	 }
	 public boolean isPalindrome(String input) {
		 String reversed = reverse(input);
		 return input.equals(reversed);
	 }
	 public String concatenate(String str1, String str2) {	 
		 return str1 + str2;
	 }
	 public int countOccurrences(String input, char target) {
	
		 int count = 0;
		 for (char c : input.toCharArray()) {
			 if (c == target) {
				 count++;
			 }
		 }
		 return count;
	 }
}