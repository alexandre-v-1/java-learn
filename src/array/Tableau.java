package array;

import java.util.ArrayList;
import java.util.Collections;

public class Tableau {
    public ArrayList<Integer> values;

    public Tableau(int size) {
        this.values = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.values.add(i);
        }
    }

    public boolean addValue(Integer value) {
        return this.values.add(value);
    }

    public void printValues () {
        this.values.forEach((v) -> System.out.print(" "+v));
        System.out.print("\n");
    }

    public void sortByDir(String order) {
        if (order != null && !order.equals("asc")) {
            this.values.sort(Collections.reverseOrder());
        } else {
            Collections.sort(this.values);
        }
    }
}
