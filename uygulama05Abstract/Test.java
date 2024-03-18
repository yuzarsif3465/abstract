package uygulama05Abstract;

public class Test {
    public static void main(String[] args) {
        Kare kare1 = new Kare(4);
        System.out.println(kare1.getAlan());
        hesapla(kare1);
        /*Sekil sekil= kare1; // bu şekilde bir atama yaprasak bunu kullanabiliriz.
        System.out.println(sekil.getAlan());*/
    }
    public static void hesapla(Sekil sekil){
        // bu şekilde kare dısında bir classs isleminide gerçekleştirebilir.
        System.out.println("alan: "+sekil.getAlan());
    }
}
