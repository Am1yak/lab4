public class Pic {
    PicType type;
    String destFile;

    public Pic(String destFile, PicType type) {
        this.type = type;
        this.destFile = destFile;
    }

    public void change() {
        type.change(destFile);
    }
}
