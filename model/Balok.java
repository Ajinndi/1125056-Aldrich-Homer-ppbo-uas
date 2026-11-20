package model;

public class Balok extends Object2D {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi, String label, String detail) {
        super(label, detail);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public double getTinggi() {
        return tinggi;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public String getPrintDetail() {
        return "Segi Empat";
    }

    @Override
    public String[][] getKeyValueDetails() {
        return new String[][] {
            {"label", "Segi Empat inputan"},
            {"panjang", panjang},
            {"lebar", lebar},
            {"tipe", getPrintDetail()}
        };
    }
}