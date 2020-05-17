package maszyny;

public class Kuchenka extends Maszyna {

    private String rodzaj;
    private int iloscPalnikow;

    public Kuchenka(String producent, String model, double cena, String rodzaj, int iloscPalnikow) {
        //dziedziczenie metod wspólnych cech z superclass
        super(producent, model, cena);

        this.rodzaj = rodzaj;
        this.iloscPalnikow = iloscPalnikow;

        System.out.println("Kuchenka");
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public void setIloscPalnikow(int iloscPalnikow) {
        this.iloscPalnikow = iloscPalnikow;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public int getIloscPalnikow() {
        return iloscPalnikow;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rodzaj: " + rodzaj + ", Ilość Palników: " + iloscPalnikow;
    }
}