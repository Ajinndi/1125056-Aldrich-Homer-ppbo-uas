package model;

public abstract class Object3D extends GObject {
    private String detail;

    public Object3D(String label, String detail) {
        super(label);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public abstract double hitungLuasPermukaan();
    public abstract double hitungVolume();

    @Override
    public String getPrintDetail() {
        return detail;
    }
}