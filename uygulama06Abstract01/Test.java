package uygulama06Abstract01;

public class Test {
    public static void main(String[] args) {
        Mercedes mercedes= new Mercedes("kırmızı", "cla", 750,"25");
        System.out.println(mercedes);
        Islemler islemler= new Islemler();

        islemler.aracBilgileri(mercedes);
        islemler.mercedesBilgileri(mercedes);
    }


}
