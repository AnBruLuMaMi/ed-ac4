package ac4.ex03;

public class Evento implements Comparable<Evento> {
    public String codigoEvento;
    public long timestamp;

    public Evento(String codigoEvento, long timestamp) {
        this.codigoEvento = codigoEvento;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return codigoEvento + "";
    }

    @Override
    public int compareTo(Evento o) {
        if (this.timestamp < o.timestamp) { return -1; }
        if (this.timestamp > o.timestamp) { return 1; }

        return 0;
    }
}
