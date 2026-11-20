package model;

import view.GObjectForm;

public abstract class Object2D extends GObjectForm {
    public Object2D(String label) {
        super(label);
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    @Override
    public String getPrintDetail(String detail) {
        return detail;
    }
}