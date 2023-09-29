// Flyweight base class for units (planets)
public abstract class Planet {
    // Intrinsic (shared) state
    private String name;
    private String ability;

    // Extrinsic (unique) state
    private int health;
    private int attack;

    // Constructor to initialize intrinsic state
    public Planet(String name, String ability) {
        this.name = name;
        this.ability = ability;
    }

    // Method to display unit information
    public void displayUnitInfo() {
        System.out.println("Name: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
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
}

