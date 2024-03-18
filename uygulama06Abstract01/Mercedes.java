package uygulama06Abstract01;

public class Mercedes extends Araba{
    private String cantKalinligi;
    public Mercedes(){

    }

    @Override
    public double kmBasiKacLtBenzin() {
        return getAgirlik()*3;
    }

    public Mercedes(String renk, String model, int agirlik, String cantKalinligi){
        super(renk,model,agirlik);
        this.cantKalinligi=cantKalinligi;
    }

    public String getCantKalinligi() {
        return cantKalinligi;
    }

    public void setCantKalinligi(String cantKalinligi) {
        this.cantKalinligi = cantKalinligi;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "renk: "+ getRenk() + " model: "+ getModel() + " agırlık: "+ getAgirlik() + " cantKalinligi= " + cantKalinligi +
                '}';
    }
}
