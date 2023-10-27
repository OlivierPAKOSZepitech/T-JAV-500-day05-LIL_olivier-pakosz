public class PowerFist extends Weapon {
    public PowerFist() {
        super("Power Fist", 8, 20, true);
    }

    @Override 
    public void attack() {
        System.out.println("SBAM");
    }
}
