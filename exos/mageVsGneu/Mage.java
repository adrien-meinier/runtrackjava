public class Mage extends Character {

    public Mage(String nom, int pointsDeVie, int attaque) {
        super(nom, pointsDeVie, attaque);
    }

    @Override
    public void attack(Character target) {
        System.out.println(nom + " ECLAIR DE GIVRE !");
        
        int degats = attaque + 4; 
        target.takeDamage(degats);
    }
}
