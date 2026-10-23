Arithmetic Operator:
Write a Java program to find the sum, difference, product, and division of two numbers.

package Operators;

public class OperatorsAssignment {
	void Arithmetic() {
		int a=50;
		int b=30;
		System.out.println("add:" + (a+b));
		System.out.println("sub:" + (a-b));
		System.out.println("mul:" + a*b);
		System.out.println("div:" + a/b);
	}
	

	public static void main(String[] args) {
	
		OperatorsAssignment Operator = new OperatorsAssignment();
			Operator.Arithmetic();
		
	}

}


2. Relational Operator:
Write a program to compare two numbers and check whether they are equal, greater, or smaller.


package Operators;

public class OperatorsAssignment {

	void Relational() {
		int a=30;
		int b=30;
		
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
	}

	public static void main(String[] args) {
	
		OperatorsAssignment Operator = new OperatorsAssignment();
	
			Operator.Relational();
		
	}

}

3. 
Assignment Operator: Write a program using +=, -=, *=, and /= operators on a variable.

package Operators;

public class OperatorsAssignment {

	void Assignment() {
		int a=30;
		int b=30;
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
	}
	public static void main(String[] args) {
	
		OperatorsAssignment Operator = new OperatorsAssignment();

			Operator.Assignment();
	}

}


4. Student Marks Calculation

A student has scored 85 marks out of 100. Store the marks as int, but calculate the percentage as a double

package Operators;

public class OperatorsAssignment {
	
	void StudentMarks() {
		int MarksScored = 85;
		int Totalmarks =100;
		double Percentage = ((double)MarksScored/Totalmarks) * 100;
		System.out.println("MarksScored:"+ MarksScored);
		System.out.println("Percentage:"+ Percentage + "%");
	}
	
	public static void main(String[] args) {
		OperatorsAssignment Operator = new OperatorsAssignment();
			Operator.StudentMarks();
	}

}



5. Product Price Calculation

A product costs 999.50. The customer buys 3 products and receives a discount of 10%.

package Operators;

public class OperatorsAssignment {
	
	void Pricecalculation() {
		float price = 999.50f;
		int Totalitems =3;
		float discount = 10/100.0f;
		
		double Totalprice = Totalitems * price;
		double Finalprice =  Totalprice  - (Totalprice*discount);
		
		System.out.println("Totalprice:"+ Totalprice);
		System.out.println("Finalprice:"+ Finalprice);
		
	}
	
	public static void main(String[] args) {
		OperatorsAssignment Operator = new OperatorsAssignment();
			Operator.Pricecalculation();
	}

}

