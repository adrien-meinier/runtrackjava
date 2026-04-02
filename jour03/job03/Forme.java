class Forme
{
    private String couleur;

    public Forme(String uneCouleur)
    {
        couleur = uneCouleur;
    }

    public Forme(Forme other)
    {
        this.couleur = other.couleur;
    }

    public Forme copie()
    {
        return new Forme(this);
    }

    public void dessine()
    {
        System.out.println("une forme " + couleur);
    }
}

