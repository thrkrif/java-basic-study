package poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PayService[] payService = {new KakaoPay("kakao"), new NaverPay("naver")};


        for(PayService pay : payService){
            System.out.println("무슨 pay를 사용하실 건가요? " + pay.getOption());
            System.out.print("입금할 금액을 입력해주세요: ");
            int amount = Integer.parseInt(scanner.nextLine());
            pay.setAmount(amount);
            pay.processPay();
        }
    }
}
