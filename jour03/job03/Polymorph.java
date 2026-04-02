class Polymorph
{
    public static void main(String[] args)
    {
        Forme[] tabFormes =
        {
            new Cercle("rouge"),
            new Triangle("jaune")
        };
        
        Collect formes = new Collect(10);

        // copie polymorphe des formes
        for (int i = 0; i < tabFormes.length; ++i)
            formes.add(tabFormes[i].copie());

        formes.dessine();
    }     
}
