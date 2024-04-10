package jihan;

public class jihan01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int result = 0;
        for (String arg : args) {
            int input = Integer.parseInt(arg);
            if (input == 1) {
                System.out.println("1円玉は使えません");
            } else if (input == 5) {
                System.out.println("5円玉は使えません");
            } else if (input == 10 || input == 50 || input == 100 || input == 500) {
                result += input;
            } else {
                System.out.println(input + "は、投入金額として、適切な値ではありません。");
            }
        }
        if (result > 0) {
            System.out.println("投入金額は、" + result + "です。");
        }
    }
}
