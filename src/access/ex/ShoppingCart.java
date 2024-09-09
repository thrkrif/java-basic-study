package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;
//TODO 나머지 코드를 완성해라.

    public void addItem(Item item){
        if(itemCount > items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount++] = item;  // 후위 연산자는 연산이 모두 종료된 이후에 실행된다.
    }

    public  void displayItems(){
        for(int i = 0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격의 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int sum = 0;
        for(int i = 0; i < itemCount; i++){
            Item item = items[i];
            sum +=  item.getTotalPrice();
        }
        return sum;
    }

}
