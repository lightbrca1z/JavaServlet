// 口座クラスです（列挙型活用ver.）
// 【利用例】new Account("1732050", AccountType.FUTSU);
package code0210;

import code0305.AccountType;

public class Account {
  private String accountNo;
  private int zandaka;
  private AccountType accountType;
  public Account(String aNo, AccountType aType) {
    this.accountNo = aNo;
    this.accountType = aType;
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
