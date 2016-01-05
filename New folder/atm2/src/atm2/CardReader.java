package atm2;

public class CardReader {

	public   boolean insertCard(ATMCard myATMCard) {
		// TODO Auto-generated method stub
		//pin=getMyATMCard.getpin;
		
		return true;
	}

	public   boolean getPin() {
		// TODO Auto-generated method stub
		if(Keyboard.enter_pin()==ATMCard.pin)
		{
		return true;
		}
		else return false;
	}
	

	
	public   int getCardno() {
		// TODO Auto-generated method stub
		if(Keyboard.enter_pin()==ATMCard.pin)
		{
			return ATMCard.atmcardno;  //from the pino, get the cardno
		}
		else return 0;
	}
	
	
	public   int getAccountno() {
		// TODO Auto-generated method stub
		if(Keyboard.enter_pin()==ATMCard.pin)
		{
			return BankAccount.accno;  //from the accno, get the cardno
		}
		else return 0;
	}
	
	public   boolean connectBank(ATMCard myBankAccount) {
		return true;
	}

	
	

}
