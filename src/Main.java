import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        test1();
    }

    private static void test1() throws FileNotFoundException {
        String fname = "triagles.txt";
        ArrayList<Triangle> trs = readFromFile(fname);
        System.out.println(trs);
        System.out.println("------------------------------");
        System.out.println("Общая площадь = " + getTotalArea(trs));
    }


    private static ArrayList<Triangle> readFromFile(String fname) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fname));
        ArrayList<Triangle> trs = new ArrayList<>();
        while (scanner.hasNext()) {
            double ab = scanner.nextDouble();
            double bc = scanner.nextDouble();
            double ac = scanner.nextDouble();
            if (ab < bc + ac && bc < ab + ac && ac < ab + bc) {
                trs.add(new Triangle(ab, bc, ac));
            }
                   }
        scanner.close();
        return trs;

    }

    public static double getTotalArea(ArrayList<Triangle> trs){
        return trs.stream().mapToDouble(Triangle::calcArea).sum();
    }
}
