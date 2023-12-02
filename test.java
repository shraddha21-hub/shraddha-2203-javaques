1 . Write a Java program to check if a vowel is present in a string.
public class StringContainsVowels {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Hello")); 
		System.out.println(stringContainsVowels("TV")); 
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}

2. Write a Java program to print a Fibonacci sequence using recursion.
public class PrintFibonacci {

	public static void printFibonacciSequence(int count) {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= count; i++) {
			System.out.print(a + ", ");

            a = b;
			b = c;
			c = a + b;
		}
	}

	public static void main(String[] args) {
    	printFibonacciSequence(10);
	}

}
3. How do you check whether a string is a palindrome in Java?
boolean checkPalindromeString(String input) {
	boolean result = true;
	int length = input.length();

	for (int i = 0; i < length/2; i++) {
		if (input.charAt(i) != input.charAt(length - i - 1)) {
			result = false;
			break;
		}
	}

	return result;
}
4.How do you find the second largest number in an array in Java?
private static int findSecondHighest(int[] array) {
	int highest = Integer.MIN_VALUE;
	int secondHighest = Integer.MIN_VALUE;

	for (int i : array) {
		if (i > highest) {
			secondHighest = highest;
			highest = i;
		} else if (i > secondHighest) {
			secondHighest = i;
		}

	}
	return secondHighest;
}
5.Show examples of overloading and overriding in Java.
// Function Overloading
class Foo {
	void print(String s) {
		System.out.println(s);
	}

	void print(String s, int count) {
		while (count > 0) {
			System.out.println(s);
			count--;
		}
	}

//Function Overriding
    class Base {
        void printName() {
            System.out.println("Base Class");
        }
    }
    
    class Child extends Base {
        @Override
        void printName() {
            System.out.println("Child Class");
        }
    }
}