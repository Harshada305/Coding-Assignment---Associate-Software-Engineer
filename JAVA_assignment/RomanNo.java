package Coding_Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman Number: ");
	        String romanNumber = scanner.nextLine();
	        scanner.close();

	        int result = romanToInt(romanNumber);
	        System.out.println("Integer Number: " + result);
	    }
	    public static int romanToInt(String s) {
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            int currentVal = romanMap.get(s.charAt(i));

	            if (currentVal < prevValue) {
	                result -= currentVal;
	            } else {
	                result += currentVal;
	            }

	            prevValue = currentVal;
	        }

	        return result;
	    }
	   
	}
