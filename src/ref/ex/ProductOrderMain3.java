package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] order = new ProductOrder[n];

       for(int i = 0; i < n; i++){
           System.out.println((i+1) + "번째 주문 정보를 입력하세요(상품명, 가격, 수량)");
           System.out.print("상품명: ");
           String productName = scanner.nextLine();
           System.out.print("가격: ");
           int price = scanner.nextInt();
           System.out.print("수량: ");
           int quantity = scanner.nextInt();
           scanner.nextLine();

           order[i] = createOrder(productName,price,quantity);
       }

        printOrders(order);
        int totalAmount = getTotalAmount(order);
        System.out.println("총 결제 금액: " + totalAmount);
    }

        static ProductOrder createOrder(String productName, int price, int quantity){
            ProductOrder order = new ProductOrder();
            order.productName = productName;
            order.price = price;
            order.quantity = quantity;
            return order;
        }

        static void printOrders(ProductOrder[] orders){
            for (ProductOrder order : orders) {
                System.out.println("상품명: " + order.productName + ", 상품 가격: " + order.price + ", 상품 갯수: " + order.quantity);
            }
        }

        static int getTotalAmount(ProductOrder[] orders){
            int sum = 0;
            for (ProductOrder order : orders) {
                sum += order.price * order.quantity;
            }
            return sum;
        }
}

