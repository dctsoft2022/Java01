package j04_Array;

class Car{
    int speed;
    String color;
    Car(){}
    Car(int speed){
        this(speed, null);
    }
    Car(int speed, String color){
        this.speed = speed;
        this.color = color;
    }
    void speedUp(){
        speed += 20;
    }
    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
public class Array03 {
    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car(10,"Red");
        cars[1] = new Car(20,"Green");
        cars[2] = new Car(30,"Black");
        for (int i=0;i< cars.length;i++){
            System.out.println("cars["+i+"] = "+cars[i]);
        }

        Car car1 = new Car();
        System.out.println("car1 = "+car1);
    }
}
