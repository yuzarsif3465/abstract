package uygulama06Abstract01;

public abstract class Araba {
    private String renk;
    private String model;
    private int agirlik;

    public Araba(){

    }
    public Araba(String renk,String model, int agirlik){
        this.model=model;
        this.renk= renk;
        this.agirlik= agirlik;
    }
    //***
    public abstract double kmBasiKacLtBenzin();
    //***
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", agirlik=" + agirlik +
                '}';
    }
}
