import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		input.nextLine();
		System.out.println(Math.abs(num));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		input.nextLine();
		System.out.print("Input another number: ");
		double num1 = input.nextDouble();
		input.nextLine();
		double result = num/num1;
		System.out.println(Math.floor(result));
		System.out.println(Math.ceil(result));
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		input.nextLine();
		System.out.println(Math.round(Math.sqrt(num)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		input.nextLine();
		System.out.print("Input another number: ");
		double num1 = input.nextDouble();
		input.nextLine();
		System.out.println(Math.pow(num, num1));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		input.nextLine();
		System.out.print("Input another number: ");
		double num1 = input.nextDouble();
		input.nextLine();
		System.out.print("Input one more number: ");
		double num2 = input.nextDouble();
		input.nextLine();
		double max = Math.max(num, num1);
		double max1 = Math.max(num1, num2);
		System.out.println(Math.max(max, max1));
		double min = Math.min(num, num1);
		double min1 = Math.min(num1, num2);
		System.out.println(Math.min(min, min1));
	}
	public static void q6() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String word = input.nextLine();
System.out.println(word.contains("on"));
	}
	public static void q7() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String word = input.nextLine();
		System.out.println(word.equalsIgnoreCase("mango"));
	}
	public static void q8() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();		
		System.out.print("Input a letter: ");
		String letter = input.nextLine();
		System.out.println(word.indexOf(letter));	
		System.out.println(word.lastIndexOf(letter));
	}

	public static void q9() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String word = input.nextLine();		
		System.out.println("Your sentence is " + word.length() + " characters long");
	}
	public static void q10() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String word = input.nextLine();	
		System.out.print("Input a word to replace: ");
		String replace = input.nextLine();		
		System.out.print("What word would you like to replace it with: ");
		String toReplace = input.nextLine();		
		System.out.println(word.replace(replace, toReplace));
	}

	public static void q11() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String word = input.nextLine();	
		String upperWord = word.toUpperCase();
		String lowerWord = word.toLowerCase();
		System.out.println(upperWord.trim());
		System.out.println(lowerWord.trim());
	}

	public static void q12() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();	
		System.out.println(word.substring(0, 4));
		System.out.println(word.substring(word.length()-4));
	}
	

}
