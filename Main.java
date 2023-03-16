package proiect;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        List<Produse> c = new ArrayList<Produse>();
        Scanner s = new Scanner(System.in);
        Scanner sp = new Scanner(System.in);
        int selection;
        do{
            System.out.println("1. Adauga produs");
            System.out.println("2. Afiseaza lista");
            System.out.println("3. Cauta produs");
            System.out.println("4. Sterge produs");
            System.out.println("5. Actualizeaza lista");
            System.out.println("6. Adauga produs in lista de cumparaturi");
            System.out.println("Alege optiunea: ");
            selection = s.nextInt();

            switch (selection){
                case 1:
                    System.out.println("Cod produs: ");
                    int cod = s.nextInt();
                    System.out.println("Denumire produs: ");
                    String denumire = sp.nextLine();
                    System.out.println("Pret produs: ");
                    double pret = s.nextDouble();

                    c.add(new Produse(cod, denumire, pret));
                    break;
                case 2:
                    System.out.println("--------------");
                    Iterator<Produse> i = c.iterator();
                    while (i.hasNext()){
                        Produse p = i.next();
                        System.out.println(p);
                    }
                    System.out.println("--------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Introdu codul produslui pe care il cautati: ");
                    int codp = s.nextInt();
                    System.out.println("--------------");
                    i = c.iterator();
                    while (i.hasNext()){
                        Produse p = i.next();
                        if(p.getCod() == codp){
                            System.out.println(p);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Nu s-a gasit produsul");
                    }
                    System.out.println("--------------");
                    break;
                case 4:
                    found = false;
                    System.out.println("Introdu codul produslui pe care vreti sa-l stergeti: ");
                    codp = s.nextInt();
                    System.out.println("--------------");
                    i = c.iterator();
                    while (i.hasNext()){
                        Produse p = i.next();
                        if(p.getCod() == codp){
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Nu s-a gasit produsul");
                    }else {
                        System.out.println("Produsul a fost sters din lista");
                    }
                    System.out.println("--------------");
                    break;
                case 5:
                    found = false;
                    System.out.println("Introdu codul produslui pe care vreti sa-l actualizati: ");
                    codp = s.nextInt();

                    ListIterator<Produse> li = c.listIterator();
                    while (li.hasNext()){
                        Produse p = li.next();
                        if(p.getCod() == codp){
                            System.out.println("Introdu noul nume al prodului: ");
                            denumire = sp.nextLine();

                            System.out.println("Introdu noul pret al prodului: ");
                            pret = s.nextDouble();

                            li.set(new Produse(codp, denumire, pret));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Nu s-a gasit produsul");
                    }else {
                        System.out.println("Produsul a fost sters din lista");
                    }
                case 6:
                    Magazin.listaCumparaturi(c);

            }
        }while (selection != 0 && selection <6);
    }
}
