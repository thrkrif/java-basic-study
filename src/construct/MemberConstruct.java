package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age){
        this(name,age,50); // -> 생성자 내에서만 this() 사용 가능, 밑에 있는 생성자를 사용한다.
        // this()를 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.
    }
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
