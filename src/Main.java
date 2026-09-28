public class Main {
    public static void main(String[] args){
//        Affichage affichage = new Affichage("AAA");
//        Affichage bffichage = new Affichage("BB");


        Thread threadA = new Affichage("AAA");
        Thread threadB = new Affichage("BB");
        Thread threadC = new Affichage("C");

        threadA.start();
        threadC.start();
        threadB.start();


    }
}
