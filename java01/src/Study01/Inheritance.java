package Study01;

public class Inheritance {
    public static void main(String[] args) {

        Sedan sedan = new Sedan();
        Truck truck = new Truck();

        sedan.upSpeed(300);
        truck.upSpeed(100);

        sedan.seatNum = 5;
        truck.capacity = 50;

        System.out.println("승용차 속도는 " + sedan.speed + "km, 좌석수는 " + sedan.getSeatNum() + "개 입니다.");
        System.out.println("트럭 속도는 " + truck.speed   + "km, 적재량은 " + truck.getCapacity() + "톤 입니다.");


    }
}

class MyCar {
    String color;
    int speed;

    void upSpeed(int value) {
        speed += value;
    }

    void downSpeed(int value) {
        speed -= value;
    }
}

class Sedan extends MyCar {
    int seatNum;

    public int getSeatNum() {
        return seatNum;
    }
}

class Truck extends MyCar {
    int capacity;

    public int getCapacity() {
        return capacity;
    }
}