package Study01;

public class Hi {
    public static void main(String[] args) {
        // 자식 클래스의 인스턴스 생성 후 실행
        JuHyeon juHyeon = new JuHyeon();
    }
}

// 부모 클래스 생성 및 부모 클래스 생성자 Oh 생성
class Oh {
    Oh() {
        System.out.println("부모 클래스 : Oh 호출");
    }
}
// 자식 클래스 생성 및 자식 클래스 생성자 JuHyeon 생성
class JuHyeon extends Oh {
    JuHyeon() {
        System.out.println("자식 클래스 : JuHyeon 호출");
    }
}