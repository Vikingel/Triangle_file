import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;


public class Triangle {
    double ab;
    double bc;
    double ac;

    public Triangle(double ab, double bc, double ac) {
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "ab=" + ab +
                ", bc =" + bc +
                ", ac=" + ac +
                '}';
    }

    public double calcArea() {
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }
}