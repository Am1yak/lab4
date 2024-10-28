import java.util.HashMap;
import java.util.Map;

public class PicFactory {
    private static HashMap<String, PicType> PicTypes = new HashMap<>();

    public static PicType getPicType(String name, String path) {
        PicType type = PicTypes.get(name);
        if (type == null) {
            type = new PicType(name, path);
            PicTypes.put(name, type);
        }
        return type;
    }

}
