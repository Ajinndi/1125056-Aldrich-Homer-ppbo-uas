package model;

public class Kubus extends Object3D {
    private double sisi;

    public Kubus(double sisi, String label, String detail) {
        super(label, detail);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    @Override
    public String getPrintDetail() {
        return "Kerucut";
    }

    @Override
    public String[][] getKeyValueDetails() {
        return new String[][] {
            {"label", "Balok inputan"},
            {"sisi", sisi},
            {"tipe", getPrintDetail()}
        };
    }
}