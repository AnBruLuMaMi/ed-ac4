package ac4.ex03;

import java.util.Comparator;

public class EventoComparator implements Comparator<Evento> {
    @Override
    public int compare(Evento o1, Evento o2) {
        return o1.compareTo(o2);
    }
}
