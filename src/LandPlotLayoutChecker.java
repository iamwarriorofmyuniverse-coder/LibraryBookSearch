import java.util.Scanner;

class Polygon {
    int sides;

    Polygon(int sides) {
        this.sides = sides;
    }

    boolean hasSameCenter(Polygon p) {
        int max = Math.max(this.sides, p.sides);
        int min = Math.min(this.sides, p.sides);
        return max % min == 0;
    }
}

public class LandPlotLayoutChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sides of Plot 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter sides of Plot 2: ");
        int s2 = sc.nextInt();
        Polygon plot1 = new Polygon(s1);
        Polygon plot2 = new Polygon(s2);
        if (plot1.hasSameCenter(plot2)) {
            System.out.println("YES, both plots have the SAME CENTRE.");
        } else {
            System.out.println("NO, both plots DO NOT have the same centre.");
        }
        sc.close();
    }
}
