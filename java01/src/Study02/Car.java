package Study02;

abstract class CarSetting{
    int speed = 0;
    String color;

    void upSpeed(int speed) {
        this.speed += speed;
    }
}

class Sedan extends CarSetting {
}

class Truck extends CarSetting {
}

public class Car {
    public static void main(String[] args) {

        //Car car1 = new CarSetting();

        Sedan sedan = new Sedan();
        System.out.println("Sedan 인스턴스 생성");

        Truck truck = new Truck();
        System.out.println("Truck 인스턴스 생성");

    }
}
