package likeLionTestQ.InterfaceAndException.InterfaceQ.Inter2Q;

public class GameObject implements Drawable, Movable{
    int x;
    int y;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("현재 좌표가 ("+ x + "," + y + ")에 그려졌습니다.");
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
