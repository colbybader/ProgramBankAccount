/*       File: BankAccount.java	.	........
 *      Class: CSC110AB
 * Programmer: Colby Bader
 *    Purpose: Simulate ATM machine
 * 
 */package bankaccount5;
 import java.util.Date;

public class BankAccount implements AccountInterface
{ 

    //data
    private final double MAXLIMIT = 500;
    private double balance;
    private boolean frozen;
    private String name;
    private Date creationDate; //java.util.Date
    private double limit; //max ATM withdrawel (usually 300)
    private int accountNumber;
    private static int howMany; //count new BankAccount()

    //Constructors: BankAccount() default; BankAccount(String theName)
    public BankAccount() //Default constructor
    {
        name = "classified";
        creationDate = new Date();
        frozen = false;
        limit = 300;
        howMany = howMany + 1;
        accountNumber = howMany;
        balance = 0;
    }

    public BankAccount(String theName)
    {
        name = theName;
        creationDate = new Date();
        frozen = false;
        limit = 300;
        howMany = howMany+1;
        accountNumber = howMany;
        balance = 0;
    }

    //Static method number of accounts
    public static int getNumAccounts() 
    {
        return howMany;
    }

    // deposit -	Throws a new IllegalArgumentException(<your explanation>) if
	//			--> the deposit amount is negative
	//		Throws a new IllegalStateException(<your explanation>) if
	//			--> the account is frozen
	//		THEN (if everything is OK), adds whatever was passed in to the
    //			balance (therefore �depositing� the money.
    public void deposit(double theMoney)
    {
        if(theMoney < 0)
            throw new IllegalArgumentException("Cannot deposit negative amount.");
        if(frozen)
            throw new IllegalStateException("Your account is frozen.");
        balance = balance + theMoney;
    }

    // withdraw -	Throws a new IllegalArgumentException(<your explanation>) if
	//		any of the following conditions occur:
	//			--> the withdrawal amount is negative
	//			--> the account does not have enough money
	//                      --> the withdrawal amount is more than the limit for that account
	//			--> the withdrawal amount is not a multiple of 20
	//		Throws a new IllegalStateException(<your explanation>) if
	//			--> the account is frozen
	//		THEN (if everything is OK), subtractS whatever is passed in from the balance
	//			(therefore "withdrawing" the money).  It also returns a double representing
	//			the amount that was withdrawn.
    public double withdraw(double theMoney)
    {
        //if statements for withdrawel amount
        if(theMoney < 0)
            throw new IllegalArgumentException("Cannot withdraw a negative ammount.");
        if(theMoney > balance)
            throw new IllegalArgumentException("The amount you entered is greater than your current balance");
        if(theMoney > limit)
            throw new IllegalArgumentException("The maximum amount of withdrawel is 300.");
        if(theMoney % 20 != 0)
            throw new IllegalArgumentException("The withdrawel amount must be in multiples of 20");
        if(frozen)
            throw new IllegalStateException("Your account is frozen.");
        balance = balance - theMoney;
        return theMoney;
    }


    // getBalance - returns double representing the account�s balance.
    public double getBalance()
    {
        return balance;
    }


    // freeze - changes its status to "frozen"
    public void freeze()
    {
        boolean frozen = true;
    }


    // unfreeze - changes its status to not "frozen"
    public void unfreeze()
    {
        boolean frozen = false;
    }


    // setLimit -	Throws a new IllegalArgumentException(<your explanation>) if
	//		any of the following conditions occur:
	//			--> the new limit is negative
	//			--> the new limit is larger than MAXLIMIT
	//		Throws a new IllegalStateException(<your explanation>) if
	//			--> the account is frozen
	//		THEN (if everything is OK), changes the limit for the account to
	//					what was passed in.
     public void setLimit(double newLimit)
     {
         if(newLimit < 0)
            throw new IllegalArgumentException("The new limit cannot be negative.");
        if(newLimit > MAXLIMIT)
            throw new IllegalArgumentException("The new limit cannot be greater than 500.");
        if(frozen)
            throw new IllegalStateException("The account is frozen.");
        limit = newLimit;
     }



     // getLimit - returns the current limit for the account
    public double getLimit()
    {
        return limit;
    }


    // toString -	returns its representation as a String.
 	//		The string should contain the account�s information (name,
 	//		account number, balance, withdrawal limit, creationDate),
 	//		and should also have \n�s in it so that each part is on a new line.
    public String toString()
    {
        return "NAME: " + name + "\n" + "ACCOUNT NUMBER: " + accountNumber + "\n" + "CURRENT BALANCE: " + balance + "\n" + "WITHDRAWEL LIMIT: " + limit + "\n" + "DATE: " + creationDate;
    }



}



