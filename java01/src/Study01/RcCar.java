package Study01;

class RcCarSetting {
    protected String color;
    int speed;
}

class RcSedan extends RcCarSetting {
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setColor(String color) {
        this.color = color;
    }
}

public class RcCar {
    public static void main(String[] args) {
        RcSedan rcSedan = new RcSedan();

        rcSedan.setColor("Red");
        rcSedan.setSpeed(300);
        System.out.println("RcSedan의 속도 => " + rcSedan.speed);
        System.out.println("RcSedan의 색상 => " + rcSedan.color);
    }
}
