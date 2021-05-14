package Third;

public class third {

	public static void main(String[] args) {
		bank b1 = new SavingAccount();
		BankImpl b = new BankImpl(b1);
		System.out.println("Method of saving account called");
		b.output();
		System.out.println("--------------------------------------------------");
		bank b2 = new CurrentAccount();
		BankImpl b3 = new BankImpl(b2);
		System.out.println("Method of current account called");
		b3.output();
	}

}
