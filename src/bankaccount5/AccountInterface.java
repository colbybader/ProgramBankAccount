package bankaccount5;

// Interfaces define what methods MUST be implemented by any class that implements them.
// Their main use in Java is to ENFORCE DESIGN.
// To force a class to implement these methods, the other class should be defined like this:
//          public class BankAccount implements AccountInterface

public interface AccountInterface
{
	// deposit -	Throws a new IllegalArgumentException(<your explanation>) if
	//			--> the deposit amount is negative
	//		Throws a new IllegalStateException(<your explanation>) if
	//			--> the account is frozen
	//		THEN (if everything is OK), adds whatever was passed in to the
	//			balance (therefore �depositing� the money.
	public void deposit(double theMoney);

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
	public double withdraw(double theMoney);

	// getBalance - returns double representing the account�s balance.
	public double getBalance();

	// freeze - changes its status to "frozen"
	public void freeze();

	// unfreeze - changes its status to not "frozen"
	public void unfreeze();

	// setLimit -	Throws a new IllegalArgumentException(<your explanation>) if
	//		any of the following conditions occur:
	//			--> the new limit is negative
	//			--> the new limit is larger than MAXLIMIT
	//		Throws a new IllegalStateException(<your explanation>) if
	//			--> the account is frozen
	//		THEN (if everything is OK), changes the limit for the account to
	//					what was passed in.
 	public void setLimit(double newLimit);

	// getLimit - returns the current limit for the account
	public double getLimit();

 	// toString -	returns its representation as a String.
 	//		The string should contain the account�s information (name,
 	//		account number, balance, withdrawal limit, creationDate),
 	//		and should also have \n�s in it so that each part is on a new line.
 	public String toString();

	// NOTE:	A STATIC METHOD CANNOT BE DEFINED IN AN INTERFACE (because:
	//		an interface lists every method that must be implemented and available
	//		to instances of the class.  But static methods go with the class, not with
	//		instances of the class.   But ONE IS LISTED HERE TO BE IMPLEMENTED.

	// getNumAccounts - a static method that returns how many accounts have been created.
	//public static int getNumAccounts();
}
