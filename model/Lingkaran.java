package model;

public class Lingkaran extends Object2D {
    private double jariJari;

    public Lingkaran(String label, String detail, double jariJari) {
        super(label, detail);
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}