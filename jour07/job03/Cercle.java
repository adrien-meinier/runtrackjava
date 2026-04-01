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

    public Forme copie()
    {
        return new Cercle(this);
    }

    public void dessine()
    {
        super.dessine();
        System.out.println("toute ronde");
    }
}
