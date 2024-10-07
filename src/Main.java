public class Main {
    public static void main(String[] args) {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++){
            v[i] = i + 2;
        }
        System.out.println(arraySum(v));
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
}