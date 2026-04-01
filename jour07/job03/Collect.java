class Collect
{
        private Forme collect[];
        private int index;

    public Collect(int indexMax)
    {
        collect = new Forme[indexMax];
        index = -1;
    }

    public void add(Forme a)
    {
        if (index < collect.length -1)
        {
            ++ index;
            collect[index] = a;
        }   
    }

    public void dessine()
    {
        for (int i = 0; i <= index; ++i)
            collect[i].dessine();
    }
}