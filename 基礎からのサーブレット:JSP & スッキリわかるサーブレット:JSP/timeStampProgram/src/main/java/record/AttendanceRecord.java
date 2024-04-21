package record;

public class AttendanceRecord {
	private int accountId;
    private String startTime;
    private String endTime;

    public AttendanceRecord(int accountId, String startTime, String endTime) {
        this.accountId = accountId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
