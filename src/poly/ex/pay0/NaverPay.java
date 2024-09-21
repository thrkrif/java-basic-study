package poly.ex.pay0;

public class NaverPay implements PayService {


    private String option;
    private int amount;

    public String getOption(){
        return option;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    NaverPay(String option){
        this.option = option;
    }
    @Override
    public boolean pay(int amount) {
        System.out.println("네이버페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }

    public void processPay() {

        System.out.println("결제를 시작합니다: option=" + this.option + ", amount=" + this.amount);
        boolean result = pay(this.amount);
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
