package view;

import java.util.*;
import util.PrintUtil;
import model.GObject;

public abstract class GObjectForm<T extends GObject> {
    private List<T> record;

    public GObjectForm() {
        record = new ArrayList<>();
    }

    public T showInsertForm() {
        String[] fields = getFields();
        String[] values = new String[fields.length];
        
        T label;
        for (int i = 0; i < fields.length; i++) {
            values[i] = PrintUtil.readLine("Masukkan " + fields[i] + " dan " + label + ": ");
        }

        T data = constructModelFromValues(label, values);
        if(record.isEmpty()) System.out.println("data masih kosong");
        record.add(data);

        return record;
    }

    protected abstract String[] getFields();
    
    protected abstract T constructModelFromValues(String label, double[] values);

    protected abstract double[] extractValuesFromModel(T model);
}