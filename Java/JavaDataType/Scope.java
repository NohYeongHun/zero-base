public class Scope{

    int num1, num2; // Instance Variable
    static int result; // Class Variable

    int add(int a, int b){ //Local Variables

        num1 = a;
        num2 = b;
        return a+b;
    }

    public static void main(String args[]){
        Scope sc = new Scope();
        result = sc.add(10,20); // Class Variable 사용
        System.out.println("Sum = " + result);
    }

}