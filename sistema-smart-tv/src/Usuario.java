public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);
        System.out.println("=================================");

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
        
        smartTv.desligar ();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
    }
}
