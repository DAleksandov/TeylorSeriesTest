package math;

public class TeylorSeries {
    public static double exp(double x, int n) {
        double exp = 1;
        double z = 1;
        double d = 1;
        for (int i = 1; i <= n; i++, d *= i) {
            z *= x;
            double q = z / d;
            exp += q;
        }
        return exp;
    }

    public static double exp(double x, double eps) {
        double exp = 1;
        int i = 1;
        double d = 1;
        double z = 1;
        double q = 1;
        do {
            z *= x;
            d *= i;
            i++;
            q = z / d;
            exp += q;
        } while (q > eps);
        return exp;
    }

    public static double sin(double x, int n) {
        double sin = x;
        double f = 1;
        int y = 1;
        double ch = x;
        for (int i = 1; i <= n; i++) {
            f *= (i * 2) * (i * 2 + 1);
            y *= -1;
            ch *= x * x;
            double q = y * ch / f;
            sin += q;
        }
        return sin;
    }

    public static double sin(double x, double eps) {
        double sin = x;
        double f = 1;
        int y = 1;
        double ch = x;
        int i = 1;
        double q;
        do {
            f *= (i * 2) * (i * 2 + 1);
            y *= -1;
            ch *= x * x;
            q = y * ch / f;
            sin += q;
            i++;
        } while (q > eps || -q > eps);
        return sin;
    }

    public static double cos(double x, int n) {
        double cos = 1;
        double f = 1;
        int y = 1;
        double ch = 1;
        for (int i = 1; i <= n; i++) {
            f *= (i * 2) * (i * 2 - 1);
            y *= -1;
            ch *= x * x;
            double q = y * ch / f;
            cos += q;
        }
        return cos;

    }

    public static double cos(double x, double eps) {
        double cos = 1;
        double f = 1;
        int y = 1;
        double ch = 1;
        int i = 1;
        double q;
        do {
            f *= (i * 2) * (i * 2 - 1);
            y *= -1;
            ch *= x * x;
            q = y * ch / f;
            cos += q;
            i++;
        } while (q > eps || -q > eps);
        return cos;
    }

    public static double atan(double x, int n) {
        double atan = x;
        double f = 1;
        int y = 1;
        double ch = x;
        for (int i = 1; i <= n; i++) {
            f += 2;
            y *= -1;
            ch *= x * x;
            double q = y * ch / f;
            atan += q;
        }
        return atan;
    }

    public static double atan(double x, double eps) {
        double sin = x;
        double f = 1;
        int y = 1;
        double ch = x;
        double q;
        do {
            f += 2;
            y *= -1;
            ch *= x * x;
            q = y * ch / f;
            sin += q;
        } while (q > eps || -q > eps);
        return sin;
    }

    public static double sinh(double x, int n) {
        double q = x;
        double sinh = q;
        for (int i = 0; i <= n; i++) {
            q *= (x * x) / ((2 * i + 3) * (2 * i + 2));
            sinh += q;
        }
        return sinh;
    }

    public static double cosh(double x, int n) {
        double q = 1;
        double cosh = q;
        for (double i = 0; i <= n; i++) {
            q *= (x * x) / ((2 * i + 1) * (2 * i + 2));
            cosh += q;
        }
        return cosh;
    }

    public static double asinh(double x, int n) {
        double q = x;
        double asinh = q;
        double z = 1;
        double c = 2;
        double b = 1;
        double m = x * x * x;
        double r = 1;
        double v;
        for (double i = 1; i <= n; i++) {
            v = z / c;
            b *= v;
            q = b * m / r;

            m *= x * x;
            c += 2;
            z += 2;
            r += 2;
            asinh += q;
        }
        return asinh;
    }

    public static double atanh(double x, int n) {
        double q = x;
        double atanh = q;
        for (double i = 0; i <= n; i++) {
            q *= (x * x * (2 * i + 1)) / (2 * i + 3);
            atanh += q;
        }
        return atanh;
    }

    public static double atanh1(double x, int n) {
        double atanh = x;
        double f = 1;
        double ch = x;
        for (int i = 1; i <= n; i++) {
            f += 2;
            ch *= x * x;
            double q = ch / f;
            atanh += q;
        }
        return atanh;
    }
}


