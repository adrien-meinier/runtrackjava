class Triangle extends Forme
{
    public Triangle(String uneCouleur)
    {
        super(uneCouleur);
    }

    public Triangle(Triangle autreTriangle)
    {
        super(autreTriangle);
    }

    public Forme copie()
    {
        return new Triangle(this);
    }

    public void dessine()
    {
        super.dessine();
        System.out.println("toute pointue");
    }
}
