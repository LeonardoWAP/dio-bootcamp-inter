public class SmartTv{
    boolean ligada = false;
    int canal =1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Tv está : ligada");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Tv está : desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para : " + volume );
    }

    public void abaixarVolume(){
        volume--;
        System.out.println("Diminuindo volume para : " + volume );
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Tv está no canal : " + canal );
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Tv está no canal : " + canal );
    }

    public void mudarCanal(int novoCanal ){
        canal = novoCanal;
        System.out.println("Tv está no canal : " + novoCanal );
    }
}