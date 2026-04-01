public class Main {
    public static void main(String[] args) {

    
        Character warrior = new Warrior("Garrosh", 30, 5);
        Character mage = new Mage("Jaina", 25, 4);

        int tour = 1;

        
        while (warrior.isAlive() && mage.isAlive()) {
            System.out.println("=== Tour " + tour + " ===");

            warrior.attack(mage);
            System.out.println(mage.getNom() + " a " + mage.getPointsDeVie() + " PV");

            if (!mage.isAlive()) break;

            mage.attack(warrior);
            System.out.println(warrior.getNom() + " a " + warrior.getPointsDeVie() + " PV");

            tour++;
            System.out.println();
        }

        System.out.println("=== Fin du combat ===");
        if (warrior.isAlive()) {
            System.out.println(warrior.getNom() + " a gagné !");
        } else {
            System.out.println(mage.getNom() + " a gagné !");
        }
    }
}