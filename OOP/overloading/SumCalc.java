package overloading;

public class SumCalc {
    
    public static int add(int v1, int v2){
        return v1 + v2;
    }

    public static int add(int v1, int v2, int v3){
        return v1 + v2 + v3;
    }

    public long add(int[] a1){
        int result = 0;
        for(int item : a1){
            result += item;
        }

        return result;
    }
}
