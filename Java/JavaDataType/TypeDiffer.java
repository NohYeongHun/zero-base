public class TypeDiffer {
    public static void main(String[] args){
        short sVal = 10;
        byte bVal = 20;
        char _han = '\uAE00';
        double test_double = 20.5;
        int test_int = 10;
        System.out.println("Type Promotion : " + (sVal + bVal));
        System.out.println("Type Casting : " + ((int)test_double + test_int));
        System.out.println(_han);
    }
}

