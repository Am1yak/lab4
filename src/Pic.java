public class Pic {
    int x;
    int y;
    PicType type;

    public Pic(int x, int y, PicType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y);
    }
}
