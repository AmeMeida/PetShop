package control;

import java.util.ArrayList;

public abstract class Control<T> {
    private ArrayList<T> list = new ArrayList<T>();

    public void add(T e) {
        list.add(e);
    }

    public boolean remove(T o) {
        return list.remove(o);
    }
}
