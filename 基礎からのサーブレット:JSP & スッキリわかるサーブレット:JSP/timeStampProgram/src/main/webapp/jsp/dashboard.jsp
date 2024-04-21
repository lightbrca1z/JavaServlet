<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %> <!-- java.util.Listをインポート -->
<%@ page import="record.AttendanceRecord" %> <!-- AttendanceRecordクラスをインポート -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome!</title>
</head>
<body>
<h1>Welcome!</h1>
 <% String message = (String) session.getAttribute("username"); %>
 <% if (message != null && !message.isEmpty()) { %>   
　　 <%-- 登録完了メッセージがセットされている場合は表示 --%>
        <p>ようこそ!<%= message %>さん！</p>
    <% } %>
<h1>ダッシュボード</h1>
    <%-- 出勤時刻打刻ボタン --%>
    <h2>打刻ボタン</h2>
    <form action="./stampCheck" method="post">
        <input type="hidden" name="action" value="start">
        <input type="submit" value="出勤時刻打刻">
    </form>
    
    <%-- 退勤時刻打刻ボタン --%>
    <form action="./stampCheck" method="post">
        <input type="hidden" name="action" value="end">
        <input type="submit" value="退勤時刻打刻">
    </form>
    
    <%-- 打刻時刻全件削除ボタン --%>
    <form action="./stampCheck" method="post">
        <input type="hidden" name="action" value="deleteAll">
        <input type="submit" value="全件削除">
    </form>
    
    <h2>出勤履歴</h2>
    <table border="1">
        <thead>
            <tr>
                <th>AccountId</th>
                <th>Start Time</th>
                <th>End Time</th>
            </tr>
        </thead>
        <tbody>
            <% List<AttendanceRecord> attendanceRecords = (List<AttendanceRecord>) request.getAttribute("attendanceRecords");
               for (AttendanceRecord record : attendanceRecords) { %>
                <tr>
                    <td><%= record.getAccountId() %></td>
                    <td><%= record.getStartTime() %></td>
                    <td><%= record.getEndTime() %></td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</body>
</html>