// 1. Class & Object – Student Management

// A college needs to store student information such as name, rollNo, and mark. Create a Student class with these properties and a method to display the student details. Create two Student objects with different values and display their details.

// Question: How will you design the class and create the objects?

package ClassandObject;

public class StudentManagement {
	
		String name;
		int rollNo;
		float marks;
		
		StudentManagement(String name, int rollNo, float marks) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.marks = marks;
	    }
		
		void StudentDetails() {
			System.out.println("Name:"+ name);
			System.out.println("RollNo:"+  rollNo);
			System.out.println("Marks:"+ marks);
			System.out.println();
		}
		

	
	public static void main(String[] args) {
		StudentManagement S1 = new StudentManagement("Bhargavi", 3 , 500.0f);
		StudentManagement S2 = new StudentManagement("Pranavi", 5 , 550.0f);
		
		S1.StudentDetails();
		S2.StudentDetails();

	}

}




// 2. Inheritance – Employee Management
// A company has a general Employee class containing name, id, and salary. A Developer class should inherit these properties and additionally contain programmingLanguage.

// Question: Create the parent and child classes using inheritance and display the complete developer information.

package Inheritance;

public class Parent {
	String name;
	int id;
	double salary;
	String programmingLanguage;
	
	public Parent(String name,int id,double salary,String programmingLanguage) {
	this.name=name;
	this.id=id;
	this.salary=salary;
	this.programmingLanguage=programmingLanguage;
	}
	
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("Salary:"+salary);
		System.out.println("Programming Language: "
                + programmingLanguage);
	}

}


package Inheritance;

public class Class extends Parent  {
	
	public Class(String name,int id,double salary,String programmingLanguage) {
		super(name,id,salary,programmingLanguage);
		}

	public static void main(String[] args) {
	
		Class C1 = new Class("Bhargavi",3,45000.0d,"Java");
		C1.display();
	}

}



// 3. Encapsulation – Bank Account
// A bank wants to protect a customer's accountNumber and balance from direct modification. The balance should only be changed through deposit() and withdraw() methods.

// Question: Create a BankAccount class using encapsulation with private variables, getters/setters where appropriate, and methods for deposit and withdrawal.



package Encapsulation;

public class BankAccount {
	
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber,double balance) {
		this.accountNumber=accountNumber;
		
		if(balance >= 0) {
		this.balance=balance;
	}
}
	
	public long getaccountNumber() {
		return accountNumber;
	}
	
	public double getbalance() {
		return balance;
	}
	

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    
	public void Withdrawal(double amount) {
		if (amount <= 0 ) {
			System.out.println("Invalid withdrawal amount");
		}
		else if(amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
	}
	
	
	public static void main(String[] args) {
		 BankAccount account = new  BankAccount(785764536748L,50000d);
		 System.out.println("Account Number: "+ account.getaccountNumber());
		 System.out.println("Initial Balance: "+ account.getbalance());
			
			account.deposit(2000.0);
			account.Withdrawal(1500.0);
			
			System.out.println("Final Balance: " + account.getbalance());
		}
	}





// 4. Polymorphism – Payment System
// An online shopping application supports different payment methods such as UPIPayment, CardPayment, and CashPayment. Each payment type should have its own implementation of the pay() method.

// Question: Use method overriding and runtime polymorphism to call the appropriate pay() method based on the payment object.

package Polymorphism;

class Payment {
    void pay() {
        System.out.println("Processing payment");
    }
}

class UPIPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}

class CardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Card");
    }
}

class CashPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Cash");
    }
}


public class PaymentSystem {


    public static void main(String[] args) {
        Payment p;

        p = new UPIPayment();
        p.pay();

        p = new CardPayment();
        p.pay();

        p = new CashPayment();
        p.pay();
    }
}

