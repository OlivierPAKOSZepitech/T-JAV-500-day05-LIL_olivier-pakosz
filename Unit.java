public abstract class Unit implements Figter{
    protected String name;
    protected int hp;
    protected int ap;

    protected Unit(String name, int hp, int ap){
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    @Override
    public boolean equip(Weapon weapon){
        return false;
    }

    @Override
    public boolean attack(Fighter target){
        return false;
    }


    @Override
    public boolean moveCloseTo(Fighter target) {
        // Implement moving logic here
        return false; // Replace with the actual implementation
    }

    @Override
    public void recoverAP() {
        // Implement AP recovery logic here
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAp() {
        return ap;
    }

    @Override
    public int getHp() {
        return hp;
    }
}