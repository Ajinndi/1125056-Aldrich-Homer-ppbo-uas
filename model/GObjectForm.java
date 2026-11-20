package model;

import java.util.*;
import util.InputUtil;

public abstract class GObjectForm<T> {
    private String label;

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
}