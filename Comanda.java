package proiect;

public class Comanda {

    private int nrComanda;
    private double pretComanda;

    public Comanda(int nrComanda, double pretComanda) {
        this.nrComanda = nrComanda;
        this.pretComanda = pretComanda;
    }

    public Comanda (){

    }

    @Override
    public String toString() {
        return "Comanda{" +
                "nrComanda=" + nrComanda +
                ", pretComanda=" + pretComanda +
                '}';
    }

    public int getNrComanda() {
        return nrComanda;
    }

    public void setNrComanda(int nrComanda) {
        this.nrComanda = nrComanda;
    }

    public double getPretComanda() {
        return pretComanda;
    }

    public void setPretComanda(double pretComanda) {
        this.pretComanda = pretComanda;
    }

}
