package model;

public class SegiEmpat extends Object2D {
    private String panjang;
    private String lebar;

    public SegiEmpat(String panjang, String lebar, String label) {
        super(label);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public String getPanjang() {
        return panjang;
    }
    public String getLebar() {
        return lebar;
    }

    public void setPanjang(String panjang) {
        this.panjang = panjang;
    }
    public void setLebar(String lebar) {
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
    public String getPrintDetail(String detail) {
        return detail;
    }

    @Override
    public String[][] getKeyValueDetails() {
        return 
    }
}