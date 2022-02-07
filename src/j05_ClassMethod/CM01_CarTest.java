package j05_ClassMethod;

public class CM01_CarTest {
    public static void main(String[] args) {
        //String test = args[0];
        //System.out.println("args[0] = "+test);

        CM01_Car myCar = new CM01_Car();
        CM01_Car uCar = new CM01_Car();

        myCar.speed = 200;
        myCar.mileage = 1000;
        myCar.color = "Black";
        System.out.println("myCar 주소 = "+myCar);
        System.out.println("myCar toString1 = "+myCar.toString1());

        uCar.color = "Red";
        uCar.mileage = 2500;
        uCar.speed = 130;
        System.out.println("uCar 주소 = "+uCar);
        System.out.println("uCar toString1 = "+uCar.toString1());

        CM01_Car newCar = myCar;
        System.out.println("newCar 주소 = "+newCar);
        System.out.println("newCar toString1 = "+newCar.toString1());
    }
}
