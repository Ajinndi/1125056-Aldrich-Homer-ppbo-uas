package model;

public class Balok extends Object3D {
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
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + tinggi * lebar);
    }

    @Override
    public String getPrintDetail() {
        return "Balok";
    }

    @Override
    public String[][] getKeyValueDetails() {
        return new String[][] {
            {"label", "Balok inputan"},
            {"panjang", super.getPanjang()},
            {"lebar", lebar},
            {"tinggi", tinggi},
            {"tipe", getPrintDetail()}
        };
    }
}