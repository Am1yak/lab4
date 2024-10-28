import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<Pic> pics = new ArrayList<Pic>();

    public void setPic(int x, int y, String fileName, String path) {
        PicType type = PicFactory.getPicType(fileName, path);
        Pic pic = new Pic(x, y, type);
        pics.add(pic);
    }

    public void draw() {
        for (Pic pic : pics) {
            pic.draw();
        }
    }
}
