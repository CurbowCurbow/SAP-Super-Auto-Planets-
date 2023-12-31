// Unit.java
public abstract class Unit 
{
    private UnitType type; // Use UnitType to store shared characteristics
    private int health;
    private int attack;

    
    public Unit(int health, int attack, UnitType type)
    {
        this.health = health;
        this.attack = attack;
        this.type = type;
    }

    // Getter methods for health, attack, and type
    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public UnitType getType() {
        return type;
    }
    
    // ... other class members and methods ...
}
