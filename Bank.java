class Bank {
	public static void main(String[] args) {
		
		//creating instance for HK and BK
		BankAccount c1 = new BankAccount();
		BankAccount c2 = new BankAccount();

		//initializing c1 instance with the object HK values
		c1.bankName = "Bank of India";
		c1.branchName = "Delhi";
		c1.ifsc = "B0878";
		c1.accNum = 248256L;
		c1.accName = "HK";
		c1.balance = 5000;

		//initializing c2 instance with the object HK values
		c2.bankName = "Axis bank";
		c2.branchName = "Mumbai";
		c2.ifsc = "A0787";
		c2.accNum = 123123L;
		c2.accName = "BK";
		c2.balance = 4000;

		System.out.println("c1 object details");
		System.out.println("c1.bankName\t: " + c1.bankName);
		System.out.println("c1.branchName\t: " + c1.branchName);
		System.out.println("c1.ifsc\t\t: " + c1.ifsc);
		System.out.println("c1.accNum\t: " + c1.accNum);
		System.out.println("c1.accName\t: " + c1.accName);
		System.out.println("c1.balance\t: " + c1.balance);

		System.out.println("c2 object details");
		System.out.println("c2.bankName\t: " + c2.bankName);
		System.out.println("c2.branchName\t: " + c2.branchName);
		System.out.println("c2.ifsc\t\t: " + c2.ifsc);
		System.out.println("c2.accNum\t: " + c2.accNum);
		System.out.println("c2.accName\t: " + c2.accName);
		System.out.println("c2.balance\t: " + c2.balance);
	}
}
