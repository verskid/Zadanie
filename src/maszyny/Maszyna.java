package maszyny;

public class Maszyna implements Comparable<Maszyna>{

    private String producent;
    private String model;
    private double cena;

    public Maszyna(String producent, String model, double cena) {
        this.producent = producent;
        this.model = model;
        this.cena = cena;

        System.out.println("Maszyna");
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getProducent() {
        return producent;
    }

    public String getModel() {
        return model;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Producent: " + producent + ", Model: " + model + ", cena: " + cena + "zł";
    }

    @Override
    public int compareTo(Maszyna maszyna) {
        return Double.compare(cena, maszyna.cena);
    }

}