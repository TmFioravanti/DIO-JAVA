public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A televisão está ligada?" + smartTv.ligada);
        System.out.println("canal atual :"+ smartTv.canal);
        System.out.println("Volume atual :" + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("A televisão está ligada?" + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

       
    }
}
