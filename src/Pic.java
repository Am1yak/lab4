/**
 * Pic class
 * Object of picture and file that it needs to change
 */
public class Pic {
    PicType type;
    String destFile;

    /**
     * Pic constructor thts stores type and destination file
     * @param destFile
     * @param type
     */
    public Pic(String destFile, PicType type) {
        this.type = type;
        this.destFile = destFile;
    }

    /**
     * Method that calls {@link PicType} method
     */
    public void change() {
        type.change(destFile);
    }
}
