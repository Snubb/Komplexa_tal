import java.util.Objects;

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
        real = this.real + b.real;
        imaginar= this.imaginar + b.imaginar;

        return new Komplex(real, imaginar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.real, real) == 0 &&
                Double.compare(komplex.imaginar, imaginar) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginar);
    }

    public Komplex multiply(Komplex b) {
        double realTemp = this.real;
        real = (this.real * b.real) - (this.imaginar * b.imaginar);
        imaginar = (this.imaginar * b.real) + (realTemp * b.imaginar);

        return new Komplex(real, imaginar);
    }

    public double arg() {

        return Math.atan(this.imaginar/this.real);
    }
}
