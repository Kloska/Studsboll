public class Studs {
    public static void main(String[] args) {
        double s = 1.5;
        double ttot = 0;
        double v = 0;
        double s0;
        int liNum = 0;
        ballStart(s, ttot);

        for (double x=5;ttot <= x; ttot += t) {
            if (s <= 0) {
                v = v * -1;
                s0 = v * t;
                s = s + s0;
            } else {
                v = v + a * t;
                s0 = v * t + (a * (t * t)) / 2;
                s = s + s0;
            }
            liNum = printList(s, ttot, liNum);
        }
    }

    private static void studs(double s, double ttot) {
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
            //System.out.print(+liNum + ". " + s + "    " + ttot);
        }
    }

    private static int printList(double s, double ttot, int liNum) {
        System.out.println(++liNum + ".    " + s + "    " + ttot);
        return liNum;
    }

    private static void ballStart(double s, double ttot) {
        System.out.println("0.   " + s + "    " + ttot);
    }

    private static final double a = -9.82;
    private static final double t = 0.01;
}
