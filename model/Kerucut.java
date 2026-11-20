package model;

public class Kerucut extends Object3D {
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi, String label, String detail) {
        super(label, detail);
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (1/3) * Math.PI * jariJari * jariJari * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return Math.PI * jariJari * (tinggi + jariJari);
    }

    @Override
    public String getPrintDetail() {
        return "Kerucut";
    }

    @Override
    public String[][] getKeyValueDetails() {
        return new String[][] {
            {"label", "Kerucut inputan"},
            {"jari-jari", jariJari},
            {"tinggi", tinggi},
            {"tipe", getPrintDetail()}
        };
    }
}