public class PicType {
    private String fileName;
    private String filePath;

    public PicType(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public void draw(int x, int y) {
        System.out.println(fileName + " " + filePath + " at x=" + x + " y=" + y);
    }
}
