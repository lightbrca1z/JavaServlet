package bankAccount3;

public class Account {
	private String accountNo;
	private int zandaka;
	private AccountType accountType;
	public Account(String accountNo, AccountType accountType) {
		this.accountNo = accountNo;
		this.accountType = accountType;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}
	
	public int getZandaka() {
		return this.zandaka;
	}
	
	public void setZandaka(int zandaka) {
		this.zandaka = zandaka;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
}
