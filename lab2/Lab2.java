package lab2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lab2 {

	public static void findNumbers(String input) {
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(input);
		System.out.println();

		while (matcher.find()) {
			System.out.println("Found substring \"" + matcher.group() + "\" starting at index " + matcher.start()
					+ " and ending at index " + matcher.end());
		}

	}

	public static void findOneDigitOneLetter(String input) {
		Pattern patternNumber = Pattern.compile("[0-9]{1}");
		Pattern patternAlphabel = Pattern.compile("[A-Z]{1}");
		Matcher matcher = patternNumber.matcher(input);
		Matcher matcher1 = patternAlphabel.matcher(input);
		System.out.println();

		while (matcher.find()) {
			System.out.println("Found number \"" + matcher.group() + "\" starting at index " + matcher.start()
					+ " and ending at index " + matcher.end());
		}

		while (matcher1.find()) {
			System.out.println("Found alphabet \"" + matcher1.group() + "\" starting at index "
					+ matcher1.start() + " and ending at index " + matcher1.end());
		}
	}

	public static void findSpace(String input) {
		
		Pattern pattern = Pattern.compile("^[^\\s]*\\s");
		Matcher matcher = pattern.matcher(input);
		System.out.println();
		
		//System.out.println("Finding Space..");
		while (matcher.find()) {
			System.out.println("Found space" + " at index " + matcher.end());
		}

	}	
	public static void Excercise5and6(String input) {
		
		Pattern pattern = Pattern.compile("[a-z][a-zA-Z][0-9]");
		Matcher matcher = pattern.matcher(input);
		System.out.println();
		
		//System.out.println("Finding Space..");
		while (matcher.find()) {
			System.out.println("Found value \"" + matcher.group() + "\" starting at index " + matcher.start()
			+ " and ending at index " + matcher.end());		}

	}	

	public static String Finder(String regexPattern, String input) {
		
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(input);
		System.out.println();
		System.out.println("Finding pattern: " + regexPattern + " for: " + input);
		String value = "";
		while (matcher.find()) {
			System.out.println("Found value \"" + matcher.group() + "\" starting at index " + matcher.start()
			+ " and ending at index " + matcher.end());		
			value = matcher.group();
		}
			return value;
	}	
	
	public static void main(String[] args) {
		// Question 1 and 2
		findNumbers("sddsa12dsa344");
		// Exercise 3
		findOneDigitOneLetter("sdbA2DdSA6Dsa12dsa344");
		// Exercise 4
		findSpace("sa s aSSDsaz s2C3");
		// Exercise 5 and 6 
		Excercise5and6("sadD3sdcacaA4d");
		// Exercise 7
		Finder("\\s[a-z][a-z]\\s", "sdaad dv sd ad ");
		// Exercise 8
		String Ex8 = Finder("\\d{4}\\s*$", "5543FFDS12d1152");
		// Exercise 9
		System.out.println("Substring digits are: " + Ex8.substring(0, 2));
		
	}

}
