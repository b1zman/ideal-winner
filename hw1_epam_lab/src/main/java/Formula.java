public class Formula {
    private int a;
    private int p;
    private double m1;
    private double m2;

    public Formula(int a, int p, double m1, double m2) {
        this.a = a;
        this.p = p;
        this.m1 = m1;
        this.m2 = m2;
    }

    public double getResultG() {
        return (4*Math.pow(Math.PI,2)*Math.pow(a,3))/(Math.pow(p,2)*(m1+m2));
    }
}

