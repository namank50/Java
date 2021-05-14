package assingmentThree;

public class SavingAccount implements Comparable<SavingAccount>{

	int acc_balance;
	Integer acc_ID;
	String accHolderName;
	Boolean isSalaryAccount;
	public SavingAccount(int acc_balance, int acc_ID, String accHolderName, Boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accHolderName = accHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	public int getAcc_balance() {
		return acc_balance;
	}
	public Integer getAcc_ID() {
		return acc_ID;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public Boolean getIsSalaryAccount() {
		return isSalaryAccount;
	}
	
	@Override
	public int compareTo(SavingAccount o) {
		return this.getAcc_ID().compareTo(o.acc_ID);
	}
	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accHolderName=" + accHolderName
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	
}
