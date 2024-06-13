<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>文房具の注文</title>
    <style>
        table {
            width: 50%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ddd;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>文房具の注文フォーム</h1>
    <form action="${pageContext.request.contextPath}/OrderServlet"" method="post"　accept-charset="UTF-8">
        <label for="name">名前：</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="email">メールアドレス：</label>
        <input type="email" id="email" name="email" required><br><br>

        <table>
            <tr>
                <th>項目名</th>
                <th>個数</th>
                <th>値段(固定)</th>
            </tr>
            <tr>
                <td>鉛筆</td>
                <td>
                    <select id="pencil" name="pencil">
                        <option value="0">0</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <!-- 必要に応じてオプションを追加 -->
                    </select>
                </td>
                <td>300</td>
            </tr>
            <tr>
                <td>定規</td>
                <td>
                    <select id="ruler" name="ruler">
                        <option value="0">0</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <!-- 必要に応じてオプションを追加 -->
                    </select>
                </td>
                <td>400</td>
            </tr>
            <tr>
                <td>消しゴム</td>
                <td>
                    <select id="eraser" name="eraser">
                        <option value="0">0</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <!-- 必要に応じてオプションを追加 -->
                    </select>
                </td>
                <td>500</td>
            </tr>
        </table>

        <input type="submit" value="確認する">
    </form>
</body>
</html>
