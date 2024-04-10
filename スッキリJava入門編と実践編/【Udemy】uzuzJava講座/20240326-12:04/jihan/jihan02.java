package jihan;

public class jihan02 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int result = 0;
        int result2 = 0;
        int lastArg = Integer.parseInt(args[args.length - 1]);
        for (int i = 0; i < args.length - 1; i++) {
            int input = Integer.parseInt(args[i]);
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
        if(lastArg > 0 && result > 0) {
        	result2 = result - lastArg;
        	System.out.println(result2 + "円のお釣りです。ありがとうございました。");
        }
    }
}
