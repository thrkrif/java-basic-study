package poly.ex.pay0;

public interface PayService {
    boolean pay(int amount);
    void processPay();

    String getOption();
    void setAmount(int amount);
}
