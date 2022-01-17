package Study02;

interface TestCarSetting {
    static final int CAR_COUNT = 0;

    abstract void work();
}

class TestSedan implements TestCarSetting {
    public void work() {
        System.out.println("승용차가 사람을 태우고 있다.");
    }
}

class TestTruck implements TestCarSetting {
    public void work() {
        System.out.println("트럭이 짐을 싣고 있다.");
    }
}

public class TestCar {
    public static void main(String[] args) {
        TestSedan testSedan = new TestSedan();
        testSedan.work();

        TestTruck testTruck = new TestTruck();
        testTruck.work();
    }
}
