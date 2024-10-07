public class Main {
    public static void main(String[] args) {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++){
            v[i] = i + 2;
        } // 2,3,4,5,6,7,8,9,10,11
        System.out.println(arraySum(v));
        System.out.println(power(10, 5));
        System.out.println(powerRecursive(5, 3));
        System.out.println(maxValue(v));
    }

    public static int arraySum(int[] n){
        return arraySum(n, 0);
    }

    protected static int arraySum(int[] n, int pos){
        if (pos == n.length)
            return 0;
        else
            return n[pos] + arraySum(n, ++pos);
    }

    public static int power(int n, int pow){
        if (pow == 0)
            return 1;
        int s = 1;
        for (int i = 0; i < pow; i++){
            s *= n;
        }
        return s;
    }

    public static double powerRecursive(int n, int pow){
        return powerRecursiveFunc(n, pow);
    }

    protected static double powerRecursiveFunc(int n, int pow){
        if (pow == 0)
            return 1;
        else if (n % 2 == 0)
            return powerRecursiveFunc(n*n, pow/2);
        else {
            return n*powerRecursiveFunc(n*n, pow/2);
        }
    }
    public static int maxValue(int[] n){
        return maxValue(n[0], n, 0);
    }
    protected static int maxValue(int tempMax, int[] n, int pos){
        if (n.length == 1)
            return n[pos];
        if (pos == n.length)
            return tempMax;
        if (tempMax < n[pos])
            tempMax = n[pos];
        return maxValue(tempMax, n, ++pos);
    }
}