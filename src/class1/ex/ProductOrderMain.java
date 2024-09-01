package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        int sum = 0;

        ProductOrder[] product = new ProductOrder[3];
        product[0] = new ProductOrder();
        product[1] = new ProductOrder();
        product[2] = new ProductOrder();


        product[0].productName = "두부";
        product[0].price = 2000;
        product[0].quantity = 2;

        product[1].productName = "김치";
        product[1].price = 5000;
        product[1].quantity = 1;

        product[2].productName = "콜라";
        product[2].price = 1000;
        product[2].quantity = 2;

        for (ProductOrder p : product) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
            sum += p.price * p.quantity;
        }
        System.out.println("총 결제 금액: " + sum);

    }
}
