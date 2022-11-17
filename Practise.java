package learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Practise {
	
	int[] array = {1,2,5,4,6,3,8,9,7};
	
	int numberToBeFind = 12;
	
	boolean found = false;
	
	public void PresentOrNot() {
		
		for (int number : array) {
			
			if (number==numberToBeFind) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Number is Present");
		} 
		else {
			System.out.println("Number is not Present");
		}
	}
	
	
	
	
	public void FindMyPosition() {
		
		//ASCII--> 97-a, 65-A
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		
		char givenChar = scanner.next().charAt(0);		
		givenChar = Character.toLowerCase(givenChar);		
		
		int asciiValue = (int)givenChar;
		
		int position = asciiValue-96;
		
		System.out.println(position);
		
	}
	
	
	
	
	public void FindOccurenceOfACharInString() {
		
		String input = "Rhaenyra";
		
		char ToFind = 'r';
		
		int occurence = 0;
		
		input = input.toLowerCase();
		
		for (int i = 0; i < input.length(); i++) {
			
			if (input.charAt(i)==ToFind) {
				occurence = occurence+1;
				
			}
			
		}
		
		System.out.println(ToFind + " is present " + occurence + " no. of times ");
	}
	
	
	
	
	public void LengthOfTheString() {
		
		String input = "Anderson";
		
		System.out.println(input.length());
		
		char[] array2 = input.toCharArray();
		
		int length = 0;
		
		for (char c : array2) {
			length++;	 
		}
		System.out.println(length);
	}
	
	
	
	
	public void ReverseANumber() {
		
		int givenNumber = 123456;
		
		int reversedNumber = 0;
		
		while (givenNumber!=0) {
			reversedNumber = reversedNumber*10;
			reversedNumber = reversedNumber + givenNumber%10;
			givenNumber = givenNumber/10;
		}
		
		System.out.println(reversedNumber);
		
	}
	
	
	
	
	public void ReverseAString() {
		
		String input = "Daemond";
		
		char[] array = input.toCharArray();
		
		String reversed = "";
		
		for (int i =array.length-1; i >= 0; i--) {
			
			reversed = reversed+array[i];
		}
		
		System.out.println(reversed);
	}
	
	
	
	
	public void ReverseAStringUsingCollection() {
		
		String input = "Gladwin";
		
		char[] array = input.toCharArray();
		
		List<Character> list = new ArrayList<Character>();
		
		for (Character character : array) {
			
			list.add(character);
			
		}
		
		Collections.reverse(list);
		
		ListIterator iterator = list.listIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	
	
	public void ReverseWordsInASentence() {
		
		String input = " Get out Meg";
		
		//expected output = Meg get Out;
		 
		String reversed = "";
		
		String[] temp = input.split(" ");
		
		for (int i = temp.length-1; i >= 0; i--) {
			
			reversed = reversed+temp[i]+" ";
		}
		
		System.out.println(reversed);
	}
	
	
	
	  
	public void SwapTwoNumbersWithThirdVariables() {
		
		int mySalary = 50;
		int bossSalary = 60;
		
		System.out.println("Before Swapping " + "My salary is " + mySalary + ", Boss Salary " + bossSalary );
		
		int temp = mySalary;
		mySalary = bossSalary;
		bossSalary = temp;
		
		System.out.println("After Swapping " + "My salary is " + mySalary + ", Boss Salary " + bossSalary );
	}
	
	
	public void SwapTwoNumbersWithoutThirdVariables() {
		
		int harish = 2208;
		int jonah = 1611;
		
		System.out.println("Before Swapping " + " Harish salary is " + harish + ", Jonah Salary is " + jonah);
	
		harish = harish-jonah;
		jonah = harish + jonah; 
		harish = jonah - harish;
		
		System.out.println("After Swapping " + " Harish salary is " + harish + ", Jonah Salary is " + jonah);
	}
	
	
	
	
	public void SwapTwoNumbersUsingMulDiv() {
		
		int harish = 2208;
		int jonah = 1611;
		
		System.out.println("Before Swapping " + " Harish salary is " + harish + ", Jonah Salary is " + jonah);
	
		harish = harish*jonah;
		jonah = harish/jonah;
		harish = harish/jonah;
		
		System.out.println("After Swapping " + " Harish salary is " + harish + ", Jonah Salary is " + jonah);

	}
	
	
	public static void main(String[] args) {
		
	 Practise practise = new Practise();
	
	
	practise.PresentOrNot();
	 
	practise.FindMyPosition();
	 
	practise.FindOccurenceOfACharInString();
	 
	practise.LengthOfTheString();
	 
	practise.ReverseANumber();
	
	practise.ReverseAString();
	 
	practise.ReverseAStringUsingCollection();
	 
	practise.ReverseWordsInASentence();
	 
	 practise.SwapTwoNumbersWithThirdVariables();
	 
	 System.out.println("*********************************");
	 
	 practise.SwapTwoNumbersWithoutThirdVariables();
	 
	 System.out.println("*********************************");
	 
	 practise.SwapTwoNumbersUsingMulDiv();
	}
	
	}
