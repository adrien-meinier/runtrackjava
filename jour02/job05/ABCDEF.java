class ABCDEF {
    public static void main(String[] args) {
        //indiquez si les affectation suivantes sont correctes:
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        a = b;
        b = a;
        a = (A) b;
        a = null;
        null = a ;
        a = d;
        b = d;
        a = e;
        d = e;

        //remplissage d'un tableau
        A[] as = new a [10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D(4);
        as[6] = new B();

        //a vous d'ajouter le code de ces deux methodes
        rechercher(as);
        addtionner(as);

    }
    private static void rechercher(A[] as){
        //a remplir
    }

    private static void  addtionner(A[] as){
        //a remplir
    }
}
