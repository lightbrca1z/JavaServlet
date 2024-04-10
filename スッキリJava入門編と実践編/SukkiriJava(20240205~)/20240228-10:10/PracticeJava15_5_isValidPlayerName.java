public class PracticeJava15_5_isValidPlayerName {

    public boolean isValidPlayerName(String name) {

        if (name.length() != 8) {
            return false;
        }
        char first = name.charAt(0);
        if (!(first >= 'A' && first <= 'Z')) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            char c = name.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        String name = "MINAT001";
        PracticeJava15_5_isValidPlayerName n = new PracticeJava15_5_isValidPlayerName();
        boolean isValid = n.isValidPlayerName(name); // isValidPlayerNameメソッドがbooleanを返すように修正
        String BoolName2 = isValid ? "YES" : "No"; // 三項演算子を使用して正しく表示
        System.out.println(BoolName2);

    }

}
