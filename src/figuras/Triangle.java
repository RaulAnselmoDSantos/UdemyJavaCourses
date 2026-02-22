package figuras;

public class Triangle {
    public double a;
    public double b;
    public double c;
    public double p;
    public double areaT;

    /*
    public Triangle(double c, double b, double a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    */

    public double area(){
        p = (a + b + c)/2;
        areaT = Math.sqrt(p* (p-a) * (p-b) * (p-c));
        return areaT;
    }
}
