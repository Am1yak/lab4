import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<Pic> pics = new ArrayList<Pic>();

    public void setPic(String destFile, String fileName, String path) {
        PicType type = PicFactory.getPicType(fileName, path);
        Pic pic = new Pic(destFile ,type);
        pics.add(pic);
    }

    public void change() {
        for (Pic pic : pics) {
            pic.change();
        }
    }
}
