package j05_ClassMethod;

public class CM07_Student {
    //1. 필드 정의
    private int sno;
    private String name;
    private String phone;
    private int score;

    //2. 생성자
    public CM07_Student(){};
    //생성자 오버로드
    public CM07_Student(int sno, String name, String phone, int score){
        this.sno = sno;
        this.name = name;
        this.phone = phone;
        this.score = score;
    }

    //3. setter, getter
    public int getSno() {
        return sno;
    }
    public void setSno(int sno) {
        if (sno<1||sno>1000){
            System.out.println("Over Range : 1~1000");
            return;
        }
        this.sno = sno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "CM07_Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", score=" + score +
                '}';
    }
}
