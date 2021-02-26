public class Komplex {
    public double real;
    public double imaginar;

    public Komplex(double real, double imaginar) {
        this.real = real;
        this.imaginar = imaginar;
    }

    @Override
    public String toString() {
        return real + " + " + imaginar + "i";
    }

    public Komplex add(Komplex b) {
    }
}
