public class TwoFightersOneWinner {
    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a = fighter1, b = fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2;
            b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) {
                return a.name;  // a wins
            }
            if ((a.health -= b.damagePerAttack) <= 0) {
                return b.name;  // b wins
            }
        }
    }

    public static void main(String[] args) {
/*        System.out.println(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry",
                5, 4
        ), "Lew"));
        System.out.println(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry",
                5, 4
        ), "Harry"));
        System.out.println(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry",
                5, 4
        ), "Harry"));*/
        System.out.println(declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald",
                20, 5
        ), "Jerry")); // stamina Jarry 6 Harald
    }
}
