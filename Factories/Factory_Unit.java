import java.util.HashMap;
import java.util.Map;

// Unit factory
public class UnitFactory {
    private static final Map<String, Unit> planetCache = new HashMap<>();

    // Factory method to create a unit
    public static Unit createUnit(String name, String ability) {
        // Check if a unit with the same name and ability already exists in the cache
        String key = name + ability;
        if (unitCache.containsKey(key)) {
            return unitCache.get(key);
        } else {
            // If not, create a new unit instance and cache it
            Unit unit = new ConcreteUnit(name, ability);
            unitCache.put(key, unit);
            return unit;
        }
    }
}