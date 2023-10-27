public interface Fighter {
        public boolean equip(Weapon);
        public boolean attack(Fighter);
        public void int receiveDamage();
        public boolean moveCloseTo(Fighter);
        public void recoverAP();
        public String getName();
        public int getAp();
        public int getHp();
    }
}
    