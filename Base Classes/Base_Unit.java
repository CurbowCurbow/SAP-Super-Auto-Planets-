// Flyweight base class for units (planets)
public abstract class Planet {
    // Intrinsic (shared) state
    private String name;

    // Extrinsic (unique) state
    private int health;
    private int attack;
    private String ability;

    // Constructor to initialize intrinsic state
    public Planet(String name) {
        this.name = name;
    }

    // Method to display unit information
    public void displayUnitInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Ability: " + ability);
    }

    // Abstract method for unit-specific behavior
    public abstract void performAction();

    // Setters for extrinsic state
    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}
