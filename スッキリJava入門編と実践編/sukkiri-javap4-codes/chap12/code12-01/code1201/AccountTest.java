package code1201;
import org.junit.jupiter.api.*;

import code1105.Account;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
  @Test public void instantiate() {
    Account a = new Account("ミナト", 30000);
    assertEquals("ミナト", a.owner);
    assertEquals(30000, a.zandaka);
  }
  @Test public void transfer() {
    /* : */
  }
}
