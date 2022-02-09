package j06_ClassExtends;
// 상속 extends
class Car{
    public int speed;
    public int mileage;
    public String color;

    public Car(){System.out.println("Car Default 생성자");}

    public Car(int speed, int mileage, String color){
        super();
        this.speed = speed;
        this.mileage = mileage;
        this.color = color;
        System.out.println("Car 초기화 실행");
    }

    public void speedUp(){
        speed += 333;
    }//speedUp

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                '}';
    }
}

class SportCar extends Car{
    int turbo;
    public SportCar(){System.out.println("SportCar Default 생성자 실행");}
    public SportCar(int speed, int mileage, String color, int turbo){
        super(speed, mileage, color);
        this.turbo = turbo;
    }

    public void turboSpeedUp(){
        turbo += super.speed;
        super.speedUp();
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", turbo=" + turbo +
                '}';
    }
}//SportCar

public class CE01_Car {
    public static void main(String[] args) {
        Car car = new Car(200,780, "Red");
        System.out.println("Car test 1 "+car);

        SportCar scar = new SportCar();
        scar.color = "Black";
        scar.speed = 135;
        scar.mileage = 367;
        scar.turbo = 4300;
        scar.turboSpeedUp();
        System.out.println("SportCar test "+scar);
        System.out.println("Car test 2 "+car);

        SportCar scar2 = new SportCar(200,3422,"Blue",3000);
        System.out.println("SportCar2 test "+scar2);
    }//main
}
