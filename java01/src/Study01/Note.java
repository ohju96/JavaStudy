package Study01;

class NoteSetting {

    //노트 필드
    String color; //노트 색상
    int page; // 노트 장 수
    private int index = 0;

    // 노트 장 수 증가
    void upPage(int value) {
        page += value;
    }

    // 노트 장 수 감소
    void downPage(int value) {
        page -= value;
    }

    //--------------------------------------------------------------

    // 노트 인덱스를 올린다.
    public void upIndex(int value) {
        if (index + value > 200){
            index = 200;
        } else {
            index += value;
        }
        System.out.println("노트의 인덱스 번호는 " + getIndex() + "입니다.");
    }

    public void downIndex(int value) {
        if (index - value > 0){
            index = 0;
        } else {
            index -= value;
        }
        System.out.println("노트의 인덱스 번호는 " + getIndex() + "입니다.");
    }

    public int getIndex(){
        return index;
    }

    //--------------------------------------------------------------

}

public class Note{
    public static void main(String[]args){

        NoteSetting myNote1 = new NoteSetting();
        myNote1.color = "Blue";
        myNote1.page = 0;

        NoteSetting myNote2 = new NoteSetting();
        myNote2.color = "Red";
        myNote2.page = 10;

        myNote1.upPage(10);
        System.out.println("1번 노트의 색상은 " + myNote1.color + "색입니다.");
        System.out.println("1번 노트의 페이지는" + myNote1.page + "페이지입니다.");

        myNote2.downPage(5);
        System.out.println("2번 노트의 색상은 " + myNote2.color + "색입니다.");
        System.out.println("2번 노트의 페이지는" + myNote2.page + "페이지입니다.");

        System.out.println("------------------------------------------------------");

        //--------------------------------------------------------------

        NoteSetting myNote3 = new NoteSetting();

        myNote3.upIndex(100);
        myNote3.upIndex(150);

        myNote3.downIndex(50);
        myNote3.downIndex(100);

        //--------------------------------------------------------------

    }
}