package org.acharya.basics;

public class TestAccount {

	public static void main(String[] args) {
		//Account raghuact = new Account();
		//int actno = raghuact.openAccount("Raghu Prasad", "prasadraghuks@gmail.com", 9845547471l, "393939939");
		Account raghuact = new Account("Raghu Prasad", "prasadraghuks@gmail.com", 9845547471l, "393939939");
		int actno = raghuact.getAcctNo();
				
		System.out.println("Acct no : "+actno);
		float amt = 10000;
		float bal = 0;
		bal = raghuact.deposit(actno, amt);
		System.out.println("Balance after deposit of : "+amt + " : "+bal);
		amt = 15000;
		bal = raghuact.deposit(actno, amt);
		System.out.println("Balance after deposit of : "+amt + " : "+bal);
		amt = 35000;
		bal = raghuact.withdraw(actno, amt);
		System.out.println("Balance after withdraw of : "+amt + " : "+bal);
		
	
		Account rameshact = new Account("Ramesh", "ramesh@gmail.com", 9845547472l, "393939939",3939399393l);
		int actno1 = raghuact.getAcctNo();
		
	
	}

}
