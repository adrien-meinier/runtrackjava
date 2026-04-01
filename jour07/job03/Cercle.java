class Cercle extends Forme
{

    public Cercle(String uneCouleur)
    {
        super(uneCouleur);
    }

    public Cercle(Cercle autreCercle)
    {
        super(autreCercle);
    }

    public void dessine()
    {
        super.dessine();
        System.out.println("toute ronde");
    }
}    
