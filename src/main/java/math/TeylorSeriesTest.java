package math;

public class TeylorSeriesTest {
    public static final double EPS = 0.0001;
    public static final int N = 200;

    public static void testExp1() {
        int i = 1;
        for (double x = 2; x <= 20; x += 1.5) {
            double res1 = Math.exp(x);
            double res2 = TeylorSeries.exp(x, N);
            String val;
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }

    public static void testExp2() {
        int i = 1;
        for (double x = 1; x <= 20; x += 1.5) {
            double res1 = Math.exp(x);
            double res2 = TeylorSeries.exp(x, EPS);
            String val;
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }

    public static void testSin1() {
        String val;
        int i = 1;
        for (double x = 2; x <= 20; x += 1.5) {
            double res1 = Math.sin(x);
            double res2 = TeylorSeries.sin(x, N);
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }

    public static void testSin2() {
        String val;
        int i = 1;
        for (double x = 2; x <= 20; x += 1.5) {
            double res1 = Math.sin(x);
            double res2 = TeylorSeries.sin(x, EPS);
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }

    public static void testCos1() {
        String val;
        int i = 1;
        for (double x = 2; x <= 20; x += 1.5) {
            double res1 = Math.cos(x);
            double res2 = TeylorSeries.cos(x, N);
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }

    public static void testCos2() {
        String val;
        int i = 1;
        for (double x = 2; x <= 20; x += 1.5) {
            double res1 = Math.cos(x);
            double res2 = TeylorSeries.cos(x, EPS);
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }

    public static void testAtan1() {
        String val;
        int i = 1;
        for (double x = 0; x <= 1 && (-x) <= 1; x += 0.015) {
            double res1 = Math.atan(x);
            double res2 = TeylorSeries.atan(x, N);
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }

    public static void testAtan2() {
        String val;
        int i = 1;
        for (double x = 0; x <= 1 && (-x) <= 1; x += 0.015) {
            double res1 = Math.atan(x);
            double res2 = TeylorSeries.atan(x, EPS);
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }

    public static void testSinh() {
        String val;
        int i = 1;
        for (double x = 2; x <= 20; x += 1.5) {
            double res1 = Math.sinh(x);
            double res2 = TeylorSeries.sinh(x, N);
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }

    public static void testCosh() {
        String val;
        int i = 1;
        for (double x = 2; x <= 20; x += 1.5) {
            double res1 = Math.cosh(x);
            double res2 = TeylorSeries.cosh(x, N);
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }

    public static void testAsinh() {
        String val;
        int i = 1;
        for (double x = 0; x < 1 && (-x) < 1; x += 0.015) {
            double res1 = Math.log(x + Math.sqrt(x * x + 1.0));
            double res2 = TeylorSeries.asinh(x, N);
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }

    public static void testAtanh() {
        String val;
        int i = 1;
        for (double x = -1 + 0.015; x < 1; x += 0.015) {
            double res1 = 0.5 * Math.log((x + 1.0) / (1.0 - x));
            double res2 = TeylorSeries.atanh1(x, N);
            if (Math.abs(res1 - res2) > EPS)
                val = "Invalid";
            else
                val = "Valid";
            System.out.println("----" + (i) + " " + x + " " + res2 + "\n" + res1 + " " + val + " " + "\n");
            i++;
        }
    }
}
