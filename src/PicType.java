public class PicType {
    private String fileName;
    private String filePath;

    public PicType(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public void change(String destFile) {
        System.out.println("Changed icon for " + destFile + " with " + fileName + " at " + filePath);
    }
}
