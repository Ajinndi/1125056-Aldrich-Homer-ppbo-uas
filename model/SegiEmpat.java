package model;

public class SegiEmpat extends Object2D {
    private double panjang;
    private double lebar;

    public SegiEmpat(double panjang, double lebar, String label, String detail) {
        super(label, detail);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }
    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
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