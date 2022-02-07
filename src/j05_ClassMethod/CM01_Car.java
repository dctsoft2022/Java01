package j05_ClassMethod;

public class CM01_Car {
    // 멤버 변수
    public int speed;
    public int mileage;
    public String color;
    // private : class 내에서 사용가능
    // default : package 내에서 사용가능
    // public : project 내에서 사용가능

    // 멤버 메서드
    public void speedUp(){
        int k = 100;
        speed += k;
    }
    public void speedDown(){
        int k = 50;
        speed -= k;
    }

    public String toString1() {
        return "CM01_Car{" +
                "speed=" + speed +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                '}';
    }
}
