/*class ABCDEF {
    public static void main(String[] args) {
        //indiquez si les affectation suivantes sont correctes:
        A a = new A(); 
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        a = b; //ok
       // b = a; //a est pas forcement un b
        a = (A) b; //ok
        a = null; //ok
       // null = a; // on peut pas avec null
        a = d; //ok
        b = d; //
        a = e; //ok
        d = e; //ok

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
    for (A a : as) {
        if (a instanceof D) {
            System.out.println("Objet de type D trouvé : " + a.getClass().getSimpleName());
         }
     }
 }

    private static void addtionner(A[] as){
    int somme = 0;

    for (A a : as) {
        if (a instanceof D) {
            somme += ((D) a).valeur;
         }
     }

    System.out.println("Somme = " + somme);
  }
}*/

