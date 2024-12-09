package likeLionTestQ.inheritance.Q4;

public class ParentManager {
    public static void main(String[] args) {
        Parent p = new Child(); // Parent타입의 변수 p에 Child객체가 저장된
        Parent p1 = new Parent();
        Child c = new Child();

        p.showMessage();   // p의 실제 객체는 Child이므 Child클래스의 showMassage가 출력됌
        p1.showMessage();
        c.showMessage();
    }
}
