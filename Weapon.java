public abstract class Weapon {
        protected String name;
        protected int apcoast; 
        protected int damage;
        protected boolean melee; 


        public String getName() {
            return name;
        }

        public int getApcoast() {
            return apcoast;
        }

        public int getDamage() {
            return damage;
        }

        public boolean isMelee() {
            return melee;
        }

        protected Weapon(String name, int apcoast, int damage, boolean melee) {
            this.name = name;
            this.apcoast = apcoast;
            this.damage = damage;
            this.melee = melee;
        }

        public abstract void attack();
    }
