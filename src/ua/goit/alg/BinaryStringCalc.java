package ua.goit.alg;

public class BinaryStringCalc {

  public static String add(String s1, String s2) {

	int maxLength = Math.max(s1.length(), s2.length());
	int minLength = Math.min(s1.length(), s2.length());

	StringBuilder finalString = new StringBuilder();
	StringBuilder zerosSubstring = new StringBuilder();

	for (int i = 0; i <= maxLength - minLength - 1; i++) {
	  zerosSubstring.append("0");
	}

	String zeros = zerosSubstring.toString();
	if (s1.length() > s2.length()) {
	  s2 = zeros + s2;	  
	} else {
	  s1 = zeros + s1;	
	}

	String overBit = "0";
	for (int i = maxLength-1; i >= 0; i--) {
	  if (s1.charAt(i) != s2.charAt(i) ) {
		if (overBit == "0") {
		  finalString.append("1");
		} else {
		  finalString.append("0");
		}
	  }
	  else if (s1.charAt(i) == '1') {
		if (overBit == "0") {
		  finalString.append("0");
		} else {
		  finalString.append("1");
		}
		overBit = "1";
	  }
	  else {
		if (overBit == "0") {
		  finalString.append("0");
		} else {
		  finalString.append("1");
		}
		overBit = "0";
	  }
	}

	if (overBit == "1") {
	  finalString.append("1");
	  overBit = "0";
	}

	String result = finalString.reverse().toString();
	return result;
  }
}