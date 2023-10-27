public abstract class Monster extends Unit {
    protected int damage;
    protected int apcost;

    public Monster(String name, int hp, int ap) {
        super(name, hp, ap);
        this.damage = 0; 
        this.apcost = 0;
    }

    public int getDamage() {
        return damage;
    }

    public int getApcost() {
        return apcost;
    }

    @Override
    public boolean attack(Fighter target) {
        if (!moveCloseTo(target)) {
            // Monster is too far away from the target
            System.out.println(name + ": I'm too far away from " + target.getName() + ".");
            return false;
        }

        if (ap >= apcost) {
            // Sufficient AP to attack
            System.out.println(name + " attacks " + target.getName() + ".");
            ap -= apcost; // Deduct apcost from AP
            target.receiveDamage(damage); // Call target's receiveDamage method
            return true;
        } else {
            // Not enough AP to attack
            System.out.println(name + ": I don't have enough AP to attack.");
            return false;
        }
    }

    public abstract boolean moveCloseTo(Fighter target);
}
