package proiect;

public class Produse {

    private int cod;
    private String denumire;
    private double pret;

    public Produse(int cod, String denumire, double pret) {
        this.cod = cod;
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "cod: " + cod + ",   " + "denumire: " + denumire + ",   " + "pret: " + pret;
    }

    public Produse (){

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}
