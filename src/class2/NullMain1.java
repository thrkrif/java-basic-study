package class2;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);    // 참조값이 없다는 의미, 아직 가리키는 객체가 없다
        data = new Data();
        System.out.println("2. data = " + data);

    }
}
