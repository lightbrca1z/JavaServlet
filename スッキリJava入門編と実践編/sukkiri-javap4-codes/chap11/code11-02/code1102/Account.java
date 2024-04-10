package code1102;
import code1103.Account;

public class Account {
  String owner;     // 口座名義人
  int zandaka;      // 口座残高
  public void Account(String owner, int zandaka) {
    owner = owner;
    zandaka = zandaka;
  }
  public void transfer(Account dest, int amount) {
    dest.zandaka += amount;
    zandaka -= amount;
  }
}
