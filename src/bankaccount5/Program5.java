package bankaccount5;//	.	........

//This is the driver for the BankAccount program.  It will create BankAccounts and tell them
//to deposit, withdraw, get their balance, etc.

public class Program5
{
	public static void main(String args[])
	{
                //Prevent Exception from printing randomly
                //Redirect System.err to System.out
                System.setErr(System.out);
                
		//declare variables
		double cash;
		BankAccount swissBankAccount;	 	//"anonymous"
		BankAccount myAccount;					//with a name

		//create a new BankAccount - use default constructor (don't pass anything)
		System.out.println("\n****** Creating a BankAccount using the default constructor\n");
		swissBankAccount = new BankAccount();

		try
		{
			System.out.println("\n****** Printing it to see what is in it\n");
			//print it (to see what the constructor put in)
			System.out.println(swissBankAccount);
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		//create a new BankAccount - pass in name to the constructor
		System.out.println("\n****** Creating another BankAccount using the parameterized constructor\n");
		myAccount = new BankAccount("Bill Gates");

		try
		{
			//print it (to see what the constructor put in)
			System.out.println("\n****** Printing it to see what is in it\n");
			System.out.println(myAccount);
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		//create a new BankAccount - pass in name to the constructor
		System.out.println("\n****** Creating another BankAccount using the parameterized constructor\n");
		myAccount = new BankAccount("Larry Fitzgerald");

		try
		{
			//print it (to see what the constructor put in)
			System.out.println("\n****** Printing it to see what is in it\n");
			System.out.println(myAccount);
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to withdraw some money (should not let us - there is none)
			System.out.println("\n****** Telling it to withdraw some money (empty; should throw an exception)\n");
			cash = myAccount.withdraw(25);
			System.out.println("The account returned this much: " + cash);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to deposit some money and then check the balance
			System.out.println("\n****** Telling it to deposit 1565.25\n");
			myAccount.deposit(1565.25);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to withdraw 2000 (should not let us - insufficient funds)
			System.out.println("\n****** Telling it to withdraw 2000 (insufficient funds; should throw an exception)\n");
			cash = myAccount.withdraw(2000);
			System.out.println("The account returned this much: " + cash);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}
		try
		{
			//tell it to deposit -40 (should not let us - negative).  Then check the balance
			System.out.println("\n****** Telling it to deposit -40 (should throw an exception)\n");
			myAccount.deposit(-40);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to withdraw -30 (should not let us - negative)
			System.out.println("\n****** Telling it to withdraw -30 (should throw an exception)\n");
			cash = myAccount.withdraw(-30);
			System.out.println("The account returned this much: " + cash);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to withdraw 400 (should not let us - too much)
			System.out.println("\n****** Telling it to withdraw 400 (too much; thould throw an exception)\n");
			cash = myAccount.withdraw(400);
			System.out.println("The account returned this much: " + cash);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to withdraw 210 (should not let us - not a multiple of 20)
			System.out.println("\n****** Telling it to withdraw 210 (not a multiple of 20; should throw an exception)\n");
			cash = myAccount.withdraw(210);
			System.out.println("The account returned this much: " + cash);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to withdraw 100 (should be OK)
			System.out.println("\n****** Telling it to withdraw 100 (should be OK)\n");
			cash = myAccount.withdraw(100);
			System.out.println("The account returned this much: " + cash);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to change its limit to 800 (should not let us - too big)
			System.out.println("\n****** Telling it to change its limit to 800 (too big; should throw an exception)\n");
			myAccount.setLimit(800);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to change its limit to -50 (should not let us - negative)
			System.out.println("\n****** Telling it to change its limit to -50 (negative; should throw an exception)\n");
			myAccount.setLimit(-50);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to change its limit to 400 (should be OK)
			System.out.println("\n****** Telling it to change its limit to 400 (should be OK)\n");
			myAccount.setLimit(400);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to withdraw 400 (should be OK now)
			System.out.println("\n****** Telling it to withdraw 400 (should be OK now)\n");
			cash = myAccount.withdraw(400);
			System.out.println("The account returned this much: " + cash);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//print it
			System.out.println("\n****** Printing it\n");
			System.out.println(myAccount);
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//ask the BankAccount class how many accounts have been created - note that
			//it is a static method so we ask the class.
			System.out.println("\n****** Telling BankAccount to return the number of accounts\n");
			System.out.println("BankAccount reports " + BankAccount.getNumAccounts() + " account(s) so far");
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		//Your Part2 code will go below this line
		System.out.println("\n--------------------------------------------------------");

		System.out.println("\n****** Creating another BankAccount using the parameterized constructor\n");
		myAccount = new BankAccount("Steve Nash");

		try
		{
			//print it (to see what the constructor put in)
			System.out.println("\n****** Printing it to see what is in it\n");
			System.out.println(myAccount);
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to deposit some money and then check the balance
			System.out.println("\n****** Telling it to deposit 439.50\n");
			myAccount.deposit(439.50);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to deposit some money and then check the balance
			System.out.println("\n****** Telling it to deposit 10\n");
			myAccount.deposit(10);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}


		try
		{
			//tell it to withdraw 60
			System.out.println("\n****** Telling it to withdraw 60\n");
			cash = myAccount.withdraw(60);
			System.out.println("The account returned this much: " + cash);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//print it
			System.out.println("\n****** Printing it\n");
			System.out.println(myAccount);
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}


		
		
		System.out.println("\n****** Creating another BankAccount using the parameterized constructor\n");
		myAccount = new BankAccount("Colby Bader");

		try
		{
			//print it (to see what the constructor put in)
			System.out.println("\n****** Printing it to see what is in it\n");
			System.out.println(myAccount);
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to deposit some money and then check the balance
			System.out.println("\n****** Telling it to deposit 45.00\n");
			myAccount.deposit(45.00);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to withdraw 20
			System.out.println("\n****** Telling it to withdraw 20\n");
			cash = myAccount.withdraw(20);
			System.out.println("The account returned this much: " + cash);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//print it
			System.out.println("\n****** Printing it\n");
			System.out.println(myAccount);
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		
		
		System.out.println("\n****** Creating another BankAccount using the parameterized constructor\n");
		myAccount = new BankAccount("Scam Artist");

		try
		{
			//print it (to see what the constructor put in)
			System.out.println("\n****** Printing it to see what is in it\n");
			System.out.println(myAccount);
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}


		try
		{
			//tell it to deposit some money and then check the balance
			System.out.println("\n****** Telling it to deposit 10\n");
			myAccount.deposit(10);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//tell it to withdraw 260
			System.out.println("\n****** Telling it to withdraw 260\n");
			cash = myAccount.withdraw(260);
			System.out.println("The account returned this much: " + cash);
			System.out.println("\n****** Telling it to return its balance\n");
			System.out.println("The balance is: " + myAccount.getBalance());
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}

		try
		{
			//print it
			System.out.println("\n****** Printing it\n");
			System.out.println(myAccount);
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}



		
		//ask BankAccount class how many accounts have been created and print results
		try
		{
			//ask the BankAccount class how many accounts have been created - note that
			//it is a static method so we ask the class.
			System.out.println("\n****** Telling BankAccount to return the number of accounts\n");
			System.out.println("BankAccount reports " + BankAccount.getNumAccounts() + " account(s) so far");
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();    //will print the exception and then the call stack
		}
		


	}
	
}