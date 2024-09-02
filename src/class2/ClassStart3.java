package class2;

public class ClassStart3 {
    public static void main(String[] args) {


        Student student1 = new Student();
        initStudent(student1, "학생1", 15,90);
        print(student1);

        Student student2 = new Student();
        initStudent(student2, "학생2", 15,80);
        print(student2);
    }

    static  void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static  void print(Student student){
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }
}
