package j05_ClassMethod;

public class CM07_StudentTest {
    public static void main(String[] args) {
        //1. 인스턴스 생성
        CM07_Student s1 = new CM07_Student();
        CM07_Student s2 = new CM07_Student(5781, "Joey", "010-5432-1092",332);
        CM07_Member m1 = new CM07_Member(
                "dctsoft", "abcdefg123", "Tony", 'M',
                "930918-1234321", "dctsoft2022@gmail.com", 893
        );

        //2. 필드 접근
        s1.setSno(243);
        s1.setName("Yeongmin");
        s1.setPhone("010-1234-5678");
        s1.setScore(4500);
        System.out.println("s1 = "+s1);

        System.out.println("s2 = "+s2);
        s2.setSno(5984);
        System.out.println("s2 = "+s2);

        System.out.println("m1 = "+m1);
    }
}
