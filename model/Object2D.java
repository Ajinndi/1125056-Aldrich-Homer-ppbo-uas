package model;

public abstract class Object2D extends GObject {
    private String detail;

    public Object2D(String label, String detail) {
        super(label);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    @Override
    public String getPrintDetail() {
        return detail;
    }
}