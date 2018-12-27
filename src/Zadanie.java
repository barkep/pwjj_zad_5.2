import java.util.HashMap;

public class Zadanie {
    public static void main(String[] args) {
        HashMap<Wspolrzedna, String> mapa = new HashMap<>();
        mapa.put(new Wspolrzedna(2, 3), "czerwony");
        mapa.put(new Wspolrzedna(-3, 0), "czarny");
        mapa.put(new Wspolrzedna(-1, 2), "czerwony");
        mapa.put(new Wspolrzedna(2, -1), "czarny");
        Wspolrzedna w = new Wspolrzedna(-1, 2);
        System.out.println("Punkt " + w.toString()
                + " ma kolor " + mapa.get(w));
    }
}