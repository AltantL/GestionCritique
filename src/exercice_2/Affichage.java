package exercice_2;

class Affichage extends Thread {

    String texte;
    static Semaphore semaphore;

    public Affichage(String txt) {
        texte = txt;
        semaphore = new SemaphoreBinaire(1);
    }

    public void run(){
        semaphore.syncWait();
        //section critique
            for(int i =0; i <texte.length( ) ; i ++) {
                System.out.print(texte.charAt(i));
                try{
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        semaphore.syncSignal();
    }
}
