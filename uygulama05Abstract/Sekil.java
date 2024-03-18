package uygulama05Abstract;

public abstract class Sekil {
// abstract classların nesneleri olusturulamaz, Sekil sekil = new Sekil() yapılamaz.
// bu classlar soyut turlar. diger class larda ki gibi kare dediginde gözunuze bir şey canlanmaz
    public abstract double getAlan();
    public abstract double getCevre();
    // not: burada ki abstract lar extend edilen class tarafıjndan kullnılkmak zorundadır.
    // abstract ların kullanılmasında ki temel sebep class lar arttıgında bazılarında bu özellik yoksa hızlıca bunu ekleyebiliriz
}
