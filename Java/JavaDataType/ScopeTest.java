// public class ScopeTest{

//     int num1, num2; // Instance Variable
//     int result; // Instance Variable

//     int add(int a, int b){ //Local Variables

//         num1 = a;
//         num2 = b;
//         return a+b;
//     }

//     public static void main(String args[]){
//         ScopeTest sc = new ScopeTest();
//         result = sc.add(10,20); // Instance Variable 사용 => Scope error
//         System.out.println("Sum = " + result);
//     }

// }