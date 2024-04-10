package bankAccount;

public class Account {
	private String accountNo;
	private int zandaka;
	private String accountType;
	public Account(String accountNo, String accountType) {
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
	
	public String getAccountType() {
		return this.accountType;
	}
}
