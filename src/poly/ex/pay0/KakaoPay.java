package poly.ex.pay0;

public class KakaoPay implements PayService{

    private String option;
    private int amount;

    KakaoPay(String option){
        this.option = option;
    }

    public String getOption(){
        return option;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }


    @Override
    public boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }

    @Override
    public void processPay() {
        System.out.println("결제를 시작합니다: option=" + this.option + ", amount=" + this.amount);
        boolean result = pay(this.amount);
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

    // 추상 메서드 구현


}
