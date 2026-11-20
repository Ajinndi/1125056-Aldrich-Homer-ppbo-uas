package view;

import java.util.*;
import util.PrintUtil;
import model.GObject;

public abstract class GObjectForm<T extends GObject> {
    private List<T> record;

    public GObjectForm() {
        record = new ArrayList<>();
    }

    public GObjectForm(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public abstract String[][] getKeyValueDetails();

    public abstract String getPrintDetail();
}