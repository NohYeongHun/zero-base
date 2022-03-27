public class Operator {
    public static void main(String[] args){
        int a = 4;
        int b = 2;
        double c = 10;
        int Result;
        double divideResult;

        Result = a + b;
        System.out.println("a+b = " + Result); // 5
        
        Result = a - b;
        System.out.println("a-b = " + Result); // 1

        Result = a * b;
        System.out.println("a*b = " + Result); // 6

        Result = a / b;
        System.out.println("a/b = " + Result); // 1

        divideResult = c / a;
        System.out.println("a/c = " + divideResult); // 2.5

        divideResult = (double)a / b;
        System.out.println("a/b = " + divideResult); // 1.5
        
        char c1 = 'A' + 1;
		char c2 = 'B';

		//char c3 = c2 + 1;	// 컴파일 에러 발생
		char c3 = (char)(c2 + 1);
		
		System.out.println("c1 = " + c1); // c1 = B
		System.out.println("c2 = " + c2); // c2 = B
		System.out.println("c3 = " + c3); // c3 = C
    }
}
