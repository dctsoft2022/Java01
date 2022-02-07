package j05_ClassMethod;

public class CM04_CallCar {
    public void carTest(CM01_Car car, int count){
        System.out.println("carTest의 car 주소 = "+car);
        for (int i=0;i<count;i++) car.speedUp();
        System.out.println("color = "+car.color+", speed = "+car.speed);
    }//carTest()

    public static void main(String[] args) {
        CM04_CallCar cm04 = new CM04_CallCar();
        CM01_Car cm01 = new CM01_Car();
        System.out.println("main cm01 주소 = "+cm01);
        cm01.color = "blue";
        cm01.speed = 450;
        cm04.carTest(cm01, 5);
        System.out.println("cm01 = "+cm01.toString1());

        // 참조자료형의 매개변수 전달방법 : 직접생성
        cm04.carTest(new CM01_Car(), 10);
    }
}
