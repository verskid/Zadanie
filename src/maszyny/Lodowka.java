package maszyny;

public class Lodowka extends Maszyna {

    private int pojemnoscChlodziarki;
    private String polozenieZamrazarki;

    public Lodowka(String producent, String model, double cena, int pojemnoscChlodziarki, String polozenieZamrazarki) {
        //dziedziczenie metod wspólnych cech z superclass
        super(producent, model, cena);
        
        this.pojemnoscChlodziarki = pojemnoscChlodziarki;
        this.polozenieZamrazarki = polozenieZamrazarki;
        
        System.out.println("Lodówka");
    }

    public void setPojemnoscChlodziarki(int pojemnoscChlodziarki) {
        this.pojemnoscChlodziarki = pojemnoscChlodziarki;
    }

    public void setPolozenieZamrazarki(String polozenieZamrazarki) {
        this.polozenieZamrazarki = polozenieZamrazarki;
    }

    public int getPojemnoscChlodziarki() {
        return pojemnoscChlodziarki;
    }

    public String getPolozenieZamrazarki() {
        return polozenieZamrazarki;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pojemność Chłodziarki: " + pojemnoscChlodziarki +" litrów" + ", Położenie Zamrażarki: " + polozenieZamrazarki;
    }
}