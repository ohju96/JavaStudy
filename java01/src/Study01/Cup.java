package Study01;

class CupSetting {

    String color;
    int number;
    // 클래스 변수는 선언 후 초기화 해줘야 한다.
    static int count = 0;

    CupSetting() {
        count++;
    }
}

public class Cup {
    public static void main(String[] args) {
        CupSetting myCup1 = new CupSetting();
        System.out.println(myCup1.count + "번째 컵 입니다.");

        CupSetting myCup2 = new CupSetting();
        System.out.println(myCup2.count + "번째 컵 입니다.");

        CupSetting myCup3 = new CupSetting();
        System.out.println(myCup3.count + "번째 컵 입니다.");

    }
}
