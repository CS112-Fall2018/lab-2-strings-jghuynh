/**
* StringFun implements different String functions and tests them on user-defined Strings.
* 1. s.length()--Measures the length of string s
* 2. s.equals(otherString) is a boolean that determines whether string s is the same as string otherString
* 3. s.substring(startIndex, endIndex) method accepts a start index and an end index on s and 
*    prints out the resulting substring
* 4. s.trim() trims out the leading and trailing whitespaces (tabs, spaces) 
* 5. s.indexOf(subString) finds the index where the first subString occurence starts on s. 
*	 If subString is not found in s, then the method prints -1.
* 6. s.lastIndexOf(subString) finds at what index is the last occurence of subString on s
*	 If subString is not found in s, then the method prints -1.
* 7. s.charAt(index) accepts an index and finds the character at that index of s (assuming that the index
*    does not go out of bounds of s).
* 
* My Chosen Methods
* 8. s.toUpperCase() capitalizes all the lowercase characters of string s using the rules of default locale.
* 	 if s already has some capitilized letters, these letters stay unaffected;
* 	 in other words, the method will not change these upper case characters into lower case.
* 	 Also, if s has some non-alpha characters (characters that are not letters, such as numbers, dashes, etc),
*	 then these non-alpha characters will also stay unaffected
* 9. s.toLowerCase() lowercases all the uppercase characters of string s using the rules of default locale.
* 	 if s already has some lowercase letteres, these letters stay unaffected;
* 	 in other words, the method will not change these lowercase letters into uppercase.
* 	 Also, if s has some non-alpha characters (characters that are not letters, such as numbers, dashes, etc),
* 	 then these non-alpha characters will also stay unaffected
* 
*/

public class StringFun {
	
	/**
	*Description here about void main
	*@param args the command-line entered by the user
	*/
	public static void main(String[] args) {

		String s = args[0];
		String otherString = args[1];
		String subString = args[2];
		//  String Methods to use:
		// *s.length()
		// *s.equals(otherString)
		// *s.substring(startIndex, endIndex)
		// *s.trim()
		// *s.indexOf(subString) 
		// *s.lastIndexOf(subString)
		// *s.charAt(index)

		// *My chosen methods:
		// * s.toUpperCase()
		// * s.
		
		// *String s = main string
		// *String subString = a substring of string s
		// *String otherString = another random string
		
		
		
		// Introducing the variable names with the user input
		System.out.println("s = " + s);
		System.out.println("otherString = " + otherString);
		System.out.println("subString = " + subString);
		System.out.println("");

		//1. s.length()--Measures the length of string s
		
		System.out.println("Length of string s = " + s.length());

		
		//2. s.equals(otherString) is a boolean that determines whether string s is the same as string otherString
		
		System.out.println("Does s = otherString? " + s.equals(otherString));

		// 3. s.substring(startIndex, endIndex) method accepts a start index and an end index on s and prints out the resulting substring
		
		System.out.println("From index 0 to index 3, what substring do we get from s?:  " + s.substring(0, 4));

		// 4. s.trim() trims out the leading and trailing whitespaces (tabs, spaces)
		
		System.out.println("Trim out leading and trailing white spaces: " + s.trim());

		// 5.  s.indexOf(subString) finds the index where the first subString occurence starts on s. 
		// If subString is not found in s, then the method prints -1.
		
		System.out.println("At what index does the first occuring subString start on s?: " + s.indexOf(subString));

		// 6. s.lastIndexOf(subString) finds at what index is the last occurence of subString on s
		// If subString is not found in s, then the method prints -1.
		
		System.out.println("At what index does the last occuring subString start on s?: " + s.lastIndexOf(subString));

		// 7. s.charAt(index) accepts an index and finds the character at that index of s (assuming that the index
		//does not go out of bounds of s).
		
		
		int index = 5;
		System.out.println("The character at index " + index + " on s is: " + s.charAt(index));

		// 8. s.toUpperCase() capitalizes all the lowercase characters of string s using the rules of default locale.
		//  if s already has some capitilized letters, these letters stay unaffected;
		//  in other words, the method will not change these upper case characters into lower case.
		//  Also, if s has some non-alpha characters (characters that are not letters, such as numbers, dashes, etc),
		//  then these non-alpha characters will also stay unaffected
		

		System.out.println("Capitalize all the characters of the string s: " + s.toUpperCase());
		
		//  9. s.toLowerCase() lowercases all the uppercase characters of string s using the rules of default locale.
		//  if s already has some lowercase letteres, these letters stay unaffected;
		//  in other words, the method will not change these lowercase letters into uppercase.
		//  Also, if s has some non-alpha characters (characters that are not letters, such as numbers, dashes, etc),
		//  then these non-alpha characters will also stay unaffected
		
		System.out.println("Lowercase all the characters of the string s: " + s.toLowerCase());
	}	
}