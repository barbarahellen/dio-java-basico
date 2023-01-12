public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartv = new SmartTv();

        System.out.println("Tv ligada? " + smartv.ligada);
        System.out.println("canal atual: " + smartv.canal);
        System.out.println("volume atual: "+ smartv.volume);

        smartv.ligar();
        System.out.println("novo status -> Tv ligada? " + smartv.ligada);

        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.diminuirVolume();
        System.out.println("novo status -> volume atual: "+ smartv.volume);

        System.out.println("canal atual "+ smartv.canal);
        smartv.mudarCanal(13);
        System.out.println("novo status -> canal atual "+ smartv.canal);

    }
}
