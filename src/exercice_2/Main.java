package exercice_2;

public class Main {
    public static void main(String[] args){
//        exercice_1.Affichage affichage = new exercice_1.Affichage("AAA");
//        exercice_1.Affichage bffichage = new exercice_1.Affichage("BB");


        Thread threadA = new Affichage("AAA");
        Thread threadB = new Affichage("BB");
        Thread threadC = new Affichage("C");

        threadA.start();
        threadB.start();
        threadC.start();


    }
}
