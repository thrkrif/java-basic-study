package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
            // 자바 16에서 나옴, if문 안에서 변수를 생성함. Child child = (Child) parent; 를 생략 가능한거임
            // CastingMain5 처럼 따로 변수 만들어서 다운캐스팅 할 필요 없음.
        }
    }

}
