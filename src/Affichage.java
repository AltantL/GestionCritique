class MyMUTEX{}

class Affichage extends Thread {

    String texte;
    static MyMUTEX sync_obj = new MyMUTEX();

    public Affichage(String txt) {
        texte = txt;
    }

    public void run(){
        synchronized (sync_obj){
            for(int i =0; i <texte.length( ) ; i ++) {
                System.out.print(texte.charAt(i));
                try{
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
