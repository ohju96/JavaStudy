package Study01;

class CarSetting {

    //필드
    private String color;
    private int speed;

    CarSetting(){

    }

    CarSetting(String color) {
        this.color = color;
    }

    CarSetting(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }
}

public class Car {
    public static void main(String[] args) {

        CarSetting myCar1 = new CarSetting();
        CarSetting myCar2 = new CarSetting("Red");
        CarSetting myCar3 = new CarSetting("Green", 100);

        System.out.println("자동차1의 색상은 " + myCar1.getColor() + "입니다.");
        System.out.println("자동차1의 속도는 " + myCar1.getSpeed() + "입니다.");
        System.out.println();
        System.out.println("자동차2의 색상은 " + myCar2.getColor() + "입니다.");
        System.out.println("자동차2의 속도는 " + myCar2.getSpeed() + "입니다.");
        System.out.println();
        System.out.println("자동차3의 색상은 " + myCar3.getColor() + "입니다.");
        System.out.println("자동차3의 속도는 " + myCar3.getSpeed() + "입니다.");

    }
}
