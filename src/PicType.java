/**
 * PicType class
 * stores information of icons that change files appearance
 */
public class PicType {
    private String fileName;
    private String filePath;

    /**
     * PicType constructor
     * @param fileName
     * @param filePath
     */
    public PicType(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    /**
     * Method for changing icon with stored Type information
     * @param destFile
     */
    public void change(String destFile) {
        System.out.println("Changed icon for " + destFile + " with " + fileName + " at " + filePath);
    }
}
