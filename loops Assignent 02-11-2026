package loopTask;
import java.util.Scanner;
public class Loop{
	
	
	public void checkNum(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("The Number is Positive Number");
		}else if(num==0) {
			System.out.println("The Number is Neither Negative Nor Positive Number");
		}
		else{
			System.out.println("The Number is Negative Number");
		}
	}
	
	public void EvenorOdd(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("The Number is Even Number");
		}else{
			System.out.println("The Number is Odd Number");
		}
	}
	
	public void vowelandConsonant(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = sc.next().charAt(0);
		
		if(Character.isDigit(ch)) {
			System.out.println("It is a number");
		}
		else if(Character.isLetter(ch)) {
			if("aeiouAEIOU".indexOf(ch) != -1) {
				System.out.println("It is a Vowel");
			}else{
				System.out.println("It is a Consonant");
			}
		}
		else {
			 System.out.println("It is neither a vowel nor a consonant");
		}
	}
	
	
	public void Largestof2Num(){
		Scanner sc = new Scanner(System.in);
		int NumA = sc.nextInt();
		int NumB = sc.nextInt();
		
		if(NumA > NumB) {
			System.out.println("A is Greater");
		}else if(NumB > NumA){
			System.out.println("B is Greater");
		}else {
			System.out.println("Both are Equal");
		}
	}
	
	
	public void LeapYear() {

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter a year:");
	    int year = sc.nextInt();

	    if (year % 400 == 0) {
	        System.out.println("Leap Year");
	    }
	    else if (year % 100 == 0) {
	        System.out.println("Not a Leap Year");
	    }
	    else if (year % 4 == 0) {
	        System.out.println("Leap Year");
	    }
	    else {
	        System.out.println("Not a Leap Year");
	    }
	}
	
	public static void main(String[] args) {
		Loop L = new Loop();
		L.checkNum();
		L.EvenorOdd();
		L.vowelandConsonant();
		L.Largestof2Num();
		L.LeapYear();
	}

}
