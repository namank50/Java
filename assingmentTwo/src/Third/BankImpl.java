package Third;

public class BankImpl {
	bank b;

	public BankImpl(bank b1) {
		super();
		this.b = b1;
	}

	public void output() {
		b.totalCash();
	}

}
