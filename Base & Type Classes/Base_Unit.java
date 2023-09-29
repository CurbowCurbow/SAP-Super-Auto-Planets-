// Unit.java
public abstract class Unit {
    private UnitType unitType; // Use PlanetType to store shared characteristics
    private int health;
    private int attack;

    public Unit(UnitType unitType) {
        this.unitType = unitType;
    }

    public String getName() {
        return unitType.getName();
    }

    public String getAbility() {
        return unitType.getAbility();
    }

    // ... other class members and methods ...
}
