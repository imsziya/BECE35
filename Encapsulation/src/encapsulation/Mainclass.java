package encapsulation;

class Account
{
	private double bal;
	public double getBal()
	{
		return bal;
	}
	public void setBal(double bal)
	{
		if(bal>0)
			this.bal=bal;
	}
}

class Transaction
{
	public static void showBal(Account act)
	{
		System.out.println("Current Balance is:"+act.getBal());			
	}
	public static void deposit(Account act,double amt)
	{
		double b=act.getBal();
		b=b+amt;
		System.out.println("Amount Credited."+amt);
		act.setBal(b);
	}
	public static void withdraw(Account act,double amt)
	{
		double b=act.getBal();
		b=b-amt;
		System.out.println("Amount Debited."+amt);
		act.setBal(b);
	}
}

public class Mainclass {

	public static void main(String[] args) 
	{
		Account a1=new Account();
		
		Transaction.deposit(a1,50000);
		Transaction.showBal(a1);
		Transaction.withdraw(a1,5000);
		Transaction.showBal(a1);
	}

}
