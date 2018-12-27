class Wspolrzedna {
    private int x, y;

    public Wspolrzedna(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int hashCode() {
        return x + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            Wspolrzedna wspolrzedna = (Wspolrzedna) obj;
            return x == wspolrzedna.x && y == wspolrzedna.y;
        }
    }
}