package main;

import java.util.ArrayList;

public class OfflineExercises {
	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") --> "TTThhheee"
	// multChar("AAbb") --> "AAAAAAbbbbbb"
	// multChar("Hi-There") --> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String[] oldStr = input.split(""); 
		String newStr = new String();
		for (String c : oldStr) {
			newStr += c + c + c;
		}
		return newStr;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") --> "evilc"
	// getBert("xxbertfridgebertyy") --> "egdirf"
	// getBert("xxBertfridgebERtyy") --> "egdirf"
	// getBert("xxbertyy") --> ""
	// getBert("xxbeRTyy") --> ""

	public String getBert(String input) {
		String str = "";
		String lCInput = input.toLowerCase();
		if  (input.toLowerCase().contains("bert")) {
			if (lCInput.substring(lCInput.indexOf("bert")+3).contains("bert")) {				
				String betweenBerts = lCInput.substring(lCInput.indexOf("bert")+4, lCInput.lastIndexOf("bert"));
				for (int i = betweenBerts.length()-1; i > -1; i--) {
					str += betweenBerts.toCharArray()[i];
					}
				} else {
					return "";
				}
			} else {
				return "";
		}		
		return str;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) --> true
	// evenlySpaced(4, 6, 2) --> true
	// evenlySpaced(4, 6, 3) --> false
	// evenlySpaced(4, 60, 9) --> false

	public boolean evenlySpaced(int a, int b, int c) {
		int [] oldArray = {a, b, c};
//		int [] newArray = new int[3];
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
		for (int i : oldArray) {
			if (i >= oldArray[0] && i >= oldArray[1] && i >= oldArray[2]) {
				
				newArrayList.add(i);
			}
		}
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) --> "Ho"
	// nMid("Chocolate", 3) --> "Choate"
	// nMid("Chocolate", 1) --> "Choclate"

	public static String nMid(String input, int a) {
		int len = input.length();
		int midIndex = len/2;
		int offset = a/2;
		String oldStrStart = input.substring(0, (midIndex-offset));
		String oldStrEnd = input.substring((len-midIndex+offset), len);
		
		return oldStrStart+oldStrEnd;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") --> true
	// endsDev("wehateDev") --> true
	// endsDev("everoyonehatesdevforreal") --> false
	// endsDev("devisnotcool") --> false

	public boolean endsDev(String input) {
		int len = input.length();
		if (len > 2) {
			String lastThree = input.substring(len-3);		
			if (lastThree.equalsIgnoreCase("dev") == true) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") --> 2
	// superBlock("abbCCCddDDDeeEEE") --> 3
	// superBlock("") --> 0

	public int superBlock(String input) {
		String[] newStr = input.split("");
		for (String c : newStr) {
			
		}
		return -1;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") --> 1
	//amISearch("I am in Amsterdam am I?") --> 2
	//amISearch("I have been in Amsterdam") --> 0

	public int amISearch(String arg1) {
		
		return 0;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) --> "fizz"
	//fizzBuzz(10) --> "buzz"
	//fizzBuzz(15) --> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		if (arg1 % 3 == 0 && arg1 % 5 == 0) {
			return "fizzbuzz";
		} else if (arg1 % 3 == 0) {
			return "fizz";
		} else if (arg1 % 5 == 0) {
			return "buzz";
		}
		return null;
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") --> 14
	//largest("15 72 80 164") --> 11
	//largest("555 72 86 45 10") --> 15
	
	public int largest(String arg1) {
		String[] ary = arg1.split(" ");
		
		for (String num : ary) {
			
		}
		return 0;
		
	}
	
	
}
