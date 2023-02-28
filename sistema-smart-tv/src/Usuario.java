public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada : " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar ();
        smartTv.desligar(); 
        
        
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();

        smartTv.mudarCanal(10);

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        
    }
}
