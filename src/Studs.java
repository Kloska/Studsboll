public class Studs {
    public static void main(String[] args) {
        double s = 1.5;
        double ttot = 0;
        System.out.println(s + "    " + ttot);

        double v = 0; double s0;
        for (double x=5;ttot <= x; ttot += t) {
            if (s <= 0 ) {
                v = v * -1;
                s0 = v * t;
                s = s + s0;
            } else {
                v = v + a * t;
                s0 = v * t + (a * (t * t)) / 2;
                s = s + s0;
            }
            System.out.println(s + "    " + ttot);
        }

//        stuts(s,ttot);
    }

    private static void stuts(double s, double ttot) {
        double v = 0; double s0;
        for (double x=5;ttot == x; ttot += t) {
            if (s >= 0 ) {
                v = v * -1;
                s0 = v * t;
                s += s0;
            } else {
                v = v + a * t;
                s0 = v * t + (a * (t * t)) / 2;
                s += s0;
            }
            System.out.print(s + "    " + ttot);
        }
    }

    private static final double a = -9.82;
    private static final double t = 0.01;
}
