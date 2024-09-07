package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("학생1", 16, 80);
        MemberConstruct member2 = new MemberConstruct("학생2", 17);

        MemberConstruct[] member = {member1,member2};

        for (MemberConstruct m : member) {
            System.out.println("이름: " + m.name + ", 나이: " + m.age + ", 성적: " + m.grade);
        }

    }
}
