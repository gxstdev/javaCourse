package generics;

import java.util.ArrayList;
import java.util.List;

public class PrinterService<Tipo> {
    private List<Tipo> list = new ArrayList<>();

    public void add(Tipo item) {
        list.add(item);
    }

    public Tipo first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        list.forEach(System.out::println);
    }
}
