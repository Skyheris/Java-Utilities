public class Graphs {

    private double incli;
    private double b;
    public Graphs(double incli, double b){
        this.incli = incli;
        this.b = b;
    }
    public Graphs (double vector, double[] point){
        this.incli = vector;
        this.b = point[1] - incli * point[0];
    }
    public Graphs (double[] pointA, double[] pointB){
        this.incli = (pointB[1] - pointA[1]) / (pointB[0] - pointA[0]);
        this.b = pointB[1] - incli * pointB[0];
    }
    public double getIncli() {
        return incli;
    }

    public double getB() {
        return b;
    }

    public boolean isIn(double x, double y){
        return y == x * incli + b;
    }
}
