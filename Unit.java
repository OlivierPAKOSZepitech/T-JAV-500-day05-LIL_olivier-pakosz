public abstract class Unit implements Fighter{
    protected String name;
    protected int hp;
    protected int ap;
    protected Fighter closeToFighter;

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
        if (target != null && closeToFighter != target && closeToFighter != this) {
            closeToFighter = target;
            System.out.println(this.name + " is moving closer to " + target.getName());
            return true;
        }
        return false; 
    }

    @Override
    public void recoverAP() {
        ap += 7;
        if (ap > 50) {
            ap = 50;
        }
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



    public void receiveDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            hp = 0;
        }
    }
}