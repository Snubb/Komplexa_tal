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
        double realTemp = this.real + b.real;
        double imaginarTemp = this.imaginar + b.imaginar;

        return new Komplex(realTemp, imaginarTemp);
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
        double realTemp = (this.real * b.real) - (this.imaginar * b.imaginar);
        double imaginarTemp = (this.imaginar * b.real) + (this.real * b.imaginar);

        return new Komplex(realTemp, imaginarTemp);
    }

    public double arg() {

        return Math.atan(this.imaginar/this.real);
    }
}
