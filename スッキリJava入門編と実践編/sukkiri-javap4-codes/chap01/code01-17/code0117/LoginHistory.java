package code0117;
public record LoginHistory(String user, int retry, boolean result) { 
  public LoginHistory {
    if (retry < 0) throw new IllegalArgumentException();
  }
}
