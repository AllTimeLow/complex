package Complex;

import static java.lang.Math.*;

public class Complex {
    public double x;
    public double y;

    public Complex(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public Complex(double _x) {
        if (_x >= 0) {
            x = sqrt(_x);
            y = 0;
        } else {
            x = 0;
            y = sqrt(-_x);
        }
    }

    public Complex invert() {
        if (x != 0)
            x = -x;
        if (y != 0)
            y = -y;
        return this;
    }

    public Complex sum(Complex c) {
        return new Complex(x + c.x, y + c.y);
    }

    public Complex minus(Complex c) {
        return new Complex(x - c.x, y - c.y);
    }

    public Complex mult(Complex c) {
        return new Complex(x * c.x - y * c.y, y * c.x + x * c.y);
    }

    public Complex div(Complex c) throws Exception {
        if ((c.x != 0) && (c.y != 0))
            return new Complex((x * c.x + y * c.y) / (c.x * c.x + c.y * c.y), (y * c.x - x * c.y) / (c.x * c.x + c.y * c.y));
        throw new Exception("Знаменатель равен 0");
    }

    public Double abs() {
        return sqrt(x * x + y * y);
    }

    public Complex cont() {
        return new Complex(x, -y);
    }

    public Double arg() throws Exception {
        if (x > 0) return atan(y / x);
        throw new Exception("Аргумент х<=0");

    }


}
