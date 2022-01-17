package Study01;

class ToyPenSetting {
    String color = "Red";

    void changeColor(String color) {
        this.color = color;
        System.out.println("장난감 연필의 색상 (부모 클래스) => " + this.color);
    }
}

class TestPen1 extends ToyPenSetting{
    void changeColor(String color) {
        super.changeColor(color);
        this.color = color;
        if (color == "Blue") {
            this.color = "Black";
        }
        System.out.println("장난감 연필의 색상 (자식 클래스) => " + this.color);
    }
}

class TestPen2 extends ToyPenSetting{

}

public class ToyPen {
    public static void main(String[] args) {

        TestPen1 testPen1 = new TestPen1();
        TestPen2 testPen2 = new TestPen2();

        System.out.print("TestPen2 => ");
        testPen2.changeColor("Blue");

        System.out.print("TestPen1 => ");
        testPen1.changeColor("Blue");
    }
}
