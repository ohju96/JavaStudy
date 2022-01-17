package Study01;

class ToCarSetting {
    ToCarSetting() {
        System.out.println("부모 클래스 생성자 호출 (파라미터 없음)");
    }

    ToCarSetting(String str) {
        System.out.println("부모 클래스 생성자 호출 => " + str);
    }
}

class ToySedan extends ToCarSetting {
    ToySedan(String str){
        //super(str);
        System.out.println("자식 클래스 생성자 호출 => " + str);
    }
}

public class ToyCar {
    public static void main(String[] args) {
        ToySedan toySedan = new ToySedan("호출합니다.");
    }
}