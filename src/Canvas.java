import java.util.ArrayList;
import java.util.List;

/**
 * Canvas class
 * Helps to maintain {@link Pic} objects
 */

public class Canvas {
    private List<Pic> pics = new ArrayList<Pic>();

    /**
     * {@code setPic()} takes {@link PicFactory} to maintain types
     * keeps hem in one List
     * @param destFile
     * @param fileName
     * @param path
     */
    public void setPic(String destFile, String fileName, String path) {
        PicType type = PicFactory.getPicType(fileName, path);
        Pic pic = new Pic(destFile ,type);
        pics.add(pic);
    }

    /**
     * {@code change()} calls {@link Pic} method for every object
     */
    public void change() {
        for (Pic pic : pics) {
            pic.change();
        }
    }
}
