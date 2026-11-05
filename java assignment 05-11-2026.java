question
Question 1: Student Functional Interface

Create a functional interface called Student with one abstract method display().

Requirements:

Implement the interface using a lambda expression.

Print student name, age and department.

Pass the student details inside the lambda implementation.

Expected output:

Student Name: Anand
Age: 22
Department: Java

@FunctionalInterface
interface Student {
    void display();
}

public class Main {
    public static void main(String[] args) {

        Student s = () -> {
            String name = "Anand";
            int age = 22;
            String department = "Java";

            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);
        };

        s.display();
    }
}



Question 2: Calculator Using Lambda
Create a functional interface called Calculator with a method calculate(int a, int b).

Requirements:

Implement addition using lambda.

Implement subtraction using lambda.

Implement multiplication using lambda.

Implement division using lambda.

Display all results.

Expected output:

Addition: 30
Subtraction: 10
Multiplication: 200
Division: 2

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println("Addition: " + add.calculate(a, b));
        System.out.println("Subtraction: " + sub.calculate(a, b));
        System.out.println("Multiplication: " + mul.calculate(a, b));
        System.out.println("Division: " + div.calculate(a, b));
    }
}


Question 3: String Methods
Write a Java program to accept a string from the user.

Requirements:

Convert the string into uppercase.

Convert the string into lowercase.

Find the string length.

Reverse the string.

Check whether the string is a palindrome.

Count the number of vowels.

Expected output:

Enter String: Madam

Uppercase: MADAM
Lowercase: madam
Length: 5
Reverse: madaM
Palindrome: Yes
Vowels: 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();


        System.out.println("Uppercase: " + str.toUpperCase());


        System.out.println("Lowercase: " + str.toLowerCase());


        System.out.println("Length: " + str.length());


        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse: " + reverse);

        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }


        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' ||
                ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);

        sc.close();
    }
}