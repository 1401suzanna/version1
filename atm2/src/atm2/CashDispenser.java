package atm2;

public class CashDispenser {

	
	
	public boolean withdraw() {
	
		
		if(Keyboard.amount()<=BankAccount.balance)
		{		
			BankAccount.balance-=Keyboard.amount();
		    return true;
		}
		else
		{
			return false;
		}
			
	}

	

}
