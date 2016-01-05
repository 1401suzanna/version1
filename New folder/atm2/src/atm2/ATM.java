package atm2;

public class ATM {

	 int initialAmmount;
	private CashDispenser cashDispenser;
	private BankAccount BankAccount;
	private CardReader cardreader;

		public ATM(int initialAmmount) {
			cardreader = new CardReader();  //constructor,creating new object
			this.cashDispenser=new CashDispenser();
			this.initialAmmount=initialAmmount;
			
		}

		public  void connectBank(BankAccount myAccount) {
			// TODO Auto-generated method stub
		this.BankAccount=myAccount;
		
		}

		public static CardReader getCardReader() {
			// TODO Auto-generated method stub
			return null;
		}

		public void CardReader(ATMCard myATMCard) {
			// TODO Auto-generated method stub
			
		}

	
		

		
	}
