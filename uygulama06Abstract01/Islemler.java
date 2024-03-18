package uygulama06Abstract01;

public class Islemler {

    public static void aracBilgileri(Araba araba){
        System.out.println(araba.kmBasiKacLtBenzin());
        System.out.println(araba.getModel());
    }
    public static void mercedesBilgileri(Mercedes mercedes){
        System.out.println(mercedes.getCantKalinligi());
    }
}
