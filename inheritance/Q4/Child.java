package likeLionTestQ.inheritance.Q4;

public class Child extends Parent{
    protected String message = "자식 클래스 메세지";


    @Override
    public void showMessage() {
        // super.showMessage(); // super을 붙이면 부모클래스의 showMessage가 출력됌 super는 부모클래스를 가르키니까
        System.out.println(message);
    }
}
