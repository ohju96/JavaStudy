package Study01;

class PenSetting {
    // 필드
    private String color;
    private int number;


    PenSetting(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

}

public class Pen {
    public static void main(String[] args) {
        PenSetting myPen1 = new PenSetting("Red", 1);
        PenSetting myPen2 = new PenSetting("Black", 2);

        System.out.println("연필1의 색상은 " + myPen1.getColor() + "입니다.");
        System.out.println("연필1은 " + myPen1.getNumber() + "개 입니다.");
        System.out.println("#############################################");
        System.out.println("연필2의 색상은 " + myPen2.getColor() + "입니다.");
        System.out.println("연필2는 " + myPen2.getNumber()  + "개 입니다.");
    }
}
