package atm2;

public class ATMClient {
public static void main(String args[])
{
	BankAccount myBankAccount=new BankAccount(1222,5000,2000);//accno,cardno,balance
	ATMCard myATMCard=new ATMCard(5000,11111); //cardno,pinno
	ATM atm=new ATM(10000);
	atm.connectBank(myBankAccount);
	CardReader cardreader=new CardReader();
	CashDispenser cashdispenser=new CashDispenser();
	
	if(cardreader.insertCard(myATMCard))
	{
		if(cardreader.getPin())
		{
			System.out.println("valid pin");
		
			if(cardreader.getCardno()!=0 && cardreader.getAccountno()!=0) //reading cardno and accno
			{
				System.out.println("amount: "+Keyboard.amount());
				System.out.println("balance: "+BankAccount.balance);
					if(cashdispenser.withdraw())
					{
					System.out.println("balance is sufffienct");	
					System.out.println("current balance: "+BankAccount.balance);
					}
					else
					System.out.println("balance is insuffient");
			}
		}
		else
		System.out.println("invalid pin");
	}
	

	
}
}
