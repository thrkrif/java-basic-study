package class2;

public class ClassStart4 {
    public static void main(String[] args) {


        Student student1 = createStudent("학생1", 16, 90);
        print(student1);

        Student student2 = createStudent("학생1", 15, 80);
        print(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }


    static  void print(Student student){
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }
}
