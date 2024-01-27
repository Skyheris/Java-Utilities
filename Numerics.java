public class Numerics {
     public Numerics(){}

    public double adder(double numb1, double numb2) {
        return numb1 + numb2;
    }

    public double takeOff(double numb1, double numb2) {
        return numb1 - numb2;
    }

    public double divide(double numb1, double numb2) {
        return numb1 / numb2;
    }

    public double multiply(double numb1, double numb2) {
        return numb1 * numb2;
    }

    public double power(double numb1, double numb2) {
        return Math.pow(numb1, numb2);
    }

    public double sqrRoot(double numb1) {
        return Math.sqrt(numb1);
    }

    public double diffRoot(double numb1, double numb2) {
        if (numb1 < 0){
            return -Math.pow(Math.abs(numb1), 1 / numb2);
        }else{
            return Math.pow(numb1, 1 / numb2);
        }
    }


    public double pytaghoras(double c1, double c2){
        return Math.sqrt((Math.pow(c1, 2) + Math.pow(c2, 2)));
    }

    public double[] solving(double numb1, double numb2, double numb3) {
        double[] results = new double[2];
        double aux = Math.pow(numb2, 2) - (4 * numb1 * numb3);
        if (aux >= 0){
            results[0] = (-numb2 + Math.sqrt(aux)) / 2 * numb1;
            results[1] = -numb2 - Math.sqrt(aux) / 2 * numb1;
        }
        return results;
    }

    public double sqrArea(double side){
        return side*side;
    }
    public double triArea(double side, double height){
        return side*height/2;
    }

    public double rectArea(double lenght, double width){
        return lenght*width;
    }

    public double circleArea(double radius){
        return Math.pow(radius, 2)*Math.PI;
    }

    public double trpzArea(double smallBase, double bigBase, double height){
        return ((smallBase+bigBase)*height)/2;
    }

    public double lszArea(double D, double d){
        return (D*d)/2;
    }

    public double pntgArea(double perimeter, double apothema){
        return (perimeter*apothema)/2;
    }

    public double hxgArea(double base, double height){
        return ((base*height)/2)*6;
    }

    public double cubeVol(double side){
        return Math.pow(side, 3);
    }

    public double paralVol(double side, double height){
        return Math.pow(side, 2)*height;
    }

    public double spheVol(double radius){
        return (4/3)*Math.PI*Math.pow(radius, 3);
    }

    public double piramVol(double side, double height){
        return (Math.pow(side, 2)*height)/3;
    }

    public double sin(double angle){
        return Math.sin(angle);
    }

    public double cos(double angle){
        return Math.cos(angle);
    }

    public double tan(double angle){
        return Math.tan(angle);
    }

    public double sinh(double sin){
        return Math.sinh(sin);
    }

    public double cosh(double cos){
        return Math.cosh(cos);
    }

    public double tanh(double tan){
        return Math.tanh(tan);
    }
}
