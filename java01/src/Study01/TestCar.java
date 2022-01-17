package Study01;

class TestCarSetting {
    int testCarSettingSpeed = 0;

    final void upSpeed(int testCarSettingSpeed) {
        this.testCarSettingSpeed += testCarSettingSpeed;
    }
}

class sedan extends TestCarSetting {
    final static String TestCarType = "승용차";

/*    void upSpeed(int testCarSettingSpeed){
        this.testCarSettingSpeed -= testCarSettingSpeed;
    }*/
}

public class TestCar {
    public static void main(String[] args) {

        System.out.println("Sedan 클래스 타입 => " + sedan.TestCarType);
    }
}
