package proiect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Magazin {

    private List<Produse> produse;
    private List<Comanda> comanda;

    public Magazin(List<Produse> produse, List<Comanda> comanda) {
        this.produse = produse;
        this.comanda = comanda;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "produse=" + produse +
                ", comanda=" + comanda +
                '}';
    }

    public List<Produse> getProduse() {
        return produse;
    }

    public void setProduse(List<Produse> produse) {
        this.produse = produse;
    }

    public List<Comanda> getComanda() {
        return comanda;
    }

    public void setComanda(List<Comanda> comanda) {
        this.comanda = comanda;
    }

    public static void listaCumparaturi(List<Produse> produse){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("listaCumparaturi.txt", true ));
            for(Produse p : produse){
                writer.write(String.valueOf(p) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


