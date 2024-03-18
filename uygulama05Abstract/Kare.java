package uygulama05Abstract;

public class Kare extends Sekil {

    private double kenar;
    public Kare(){

    }
    public Kare(double kenar){
        this.kenar= kenar;
    }
    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double getAlan() {
        return Math.pow(kenar,2);
    }

    @Override
    public double getCevre() {
        return 4*kenar;
    }
}
