package lab3;

import java.util.regex.*;

public class Lab3 {

	public static void QuestionOne(String word) {

		boolean a = Pattern.matches("a{1,3}", word);
		boolean b = Pattern.matches("a+", word);
		boolean c = Pattern.matches("a{0,3}", word);
		boolean d = Pattern.matches("a*", word);

		System.out.println("Question 1");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
	}

	public static boolean questionTwoB(String word) {
		boolean A = false;
		if (Pattern.matches("c*d*", word)) {
			int c = 0;
			int d = 0;
			for (int i = 0; i < word.length(); i++) {
				char w = word.charAt(i);
				if (w == 'c') {
					c++;
				} else if (w == 'd') {
					d++;
				} else {
				}
			}
			if (c == d) {
				A = true;
			} else {
				A = false;
			}

		}
		return A;
	}

	public static boolean questionTwoC(String word) {
		boolean A = false;
		if (Pattern.matches("c*", word) && (word.length() % 2 > 0) || word.length() == 0) {
			A = true;
		}
		return A;
	}

	public static boolean questionTwoE(String word) {
		boolean A = false;
		if (word.length() == 0) {
			A = true;
		} else if (Pattern.matches("c*d*", word)) {
			int c = 0;
			int d = 0;
			for (int i = 0; i < word.length(); i++) {
				char w = word.charAt(i);
				if (w == 'c') {
					c++;
				} else if (w == 'd') {
					d++;
				} else {
				}
			}
			if (c == 0 || d == 0) {
				A = false;
			} else {
				A = true;
			}
		}
		return A;
	}

	public static void QuestionTwo(String word) {

		boolean a =  Pattern.matches("c*", word);
		boolean b = questionTwoB(word);
		boolean c = questionTwoC(word);
		boolean d = Pattern.matches("c+d+", word);
		boolean e = questionTwoE(word);

		System.out.println("Question 2");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);

	}

	public static boolean questionThreeB(String word) {
		boolean A = false;
		if (word.length() == 0) {
			A = true;
		} else if (Pattern.matches("a+b+", word)) {
			int b = 0;
			int a = 0;
			for (int i = 0; i < word.length(); i++) {
				char w = word.charAt(i);
				if (w == 'b') {
					b++;
				} else if (w == 'a') {
					a++;
				} else {
				}
			}
			if (b < a) {
				A = true;
			} else {
				A = false;
			}
		}
		return A;
	}

	public static boolean questionThreeC(String word) {
		boolean A = false;
		if (word.length() == 0) {
			A = true;
		} else if (Pattern.matches("a+b*", word)) {
			int b = 0;
			int a = 0;
			for (int i = 0; i < word.length(); i++) {
				char w = word.charAt(i);
				if (w == 'b') {
					b++;
				} else if (w == 'a') {
					a++;
				} else {
				}
			}
			if (b < a) {
				A = true;
			} else {
				A = false;
			}
		}
		return A;
	}
	public static boolean questionThreeA(String word) {
		boolean A = false;
		if (Pattern.matches("a+b+", word)) {
			int c = 0;
			int d = 0;
			for (int i = 0; i < word.length(); i++) {
				char w = word.charAt(i);
				if (w == 'a') {
					c++;
				} else if (w == 'b') {
					d++;
				} else {
				}
			}
			if (c == d) {
				A = true;
			} else {
				A = false;
			}
		}
		return A;
	}
	public static void QuestionThree(String word) {
		boolean a = questionThreeA(word);
		boolean b = questionThreeB(word);
		boolean c = questionThreeC(word);

		System.out.println("Question 3");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

	}

	public static void main(String[] args) {
		String ptrn0 = "aaaaa";
		String ptrn = "cccccddd";
		String ptrn2 = "aabb";

		System.out.println("Pattern is " + ptrn);
		QuestionOne(ptrn0);
		System.out.println("---");
		QuestionTwo(ptrn);
		System.out.println("---");
		QuestionThree(ptrn2);

	}

}
