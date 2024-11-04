import java.util.HashMap;

/**
 * PicFactory class
 * maintains {@link PicType} objects
 */
public class PicFactory {
    private static HashMap<String, PicType> PicTypes = new HashMap<>();

    /**
     * Makes new {@link PicType} if it doesn`t exist
     * @param name
     * @param path
     * @return
     */
    public static PicType getPicType(String name, String path) {
        PicType type = PicTypes.get(name);
        if (type == null) {
            type = new PicType(name, path);
            PicTypes.put(name, type);
        }
        return type;
    }

}
