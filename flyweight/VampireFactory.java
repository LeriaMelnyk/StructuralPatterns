package flyweight;
import java.util.HashMap;
import java.util.Map;

public class VampireFactory {
    private static final Map<String, VampireType> types = new HashMap<>();

    public static VampireType getVampireType(String type) {
        types.putIfAbsent(type, new VampireType(type));
        return types.get(type);
    }
}
