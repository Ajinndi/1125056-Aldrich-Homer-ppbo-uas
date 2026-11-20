package model;

public abstract class Object3D extends GObjectForm {
    public Object3D(String label) {
        super(label);
    }

    public abstract double hitungLuasPermukaan();
    public abstract double hitungVolume();
}