import java.util.Objects;

public class Komplex {
    public double real;
    public double imaginar;

    public Komplex(double real, double imaginar) {
        this.real = real;
        this.imaginar = imaginar;
    }

    public Komplex add(Komplex b) { //adderar med formeln: (a+bi) + (c+di) = (a+c) + (b+d)i
        double realTemp = this.real + b.real;
        double imaginarTemp = this.imaginar + b.imaginar;

        return new Komplex(realTemp, imaginarTemp);
    }

    public Komplex multiply(Komplex b) { //multplicerar med formeln: (a+bi)(c+di) = (ac-bd) + (bc+ad)i
        double realTemp = (this.real * b.real) - (this.imaginar * b.imaginar);
        double imaginarTemp = (this.imaginar * b.real) + (this.real * b.imaginar);

        return new Komplex(realTemp, imaginarTemp);
    }

    public double arg() { //tar ut argumentet enligt formeln: taninvers(b/a)

        return Math.atan(this.imaginar/this.real);
    }

    @Override //fixar så att toString skriver en läsbar string istället för gibberish
    public String toString() {
        return real + " + " + imaginar + "i";
    }

    @Override //gör så att equals fungerar
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
}
