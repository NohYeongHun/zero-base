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

        // 비트 연산자.
        int i1 = 20;
        double i2 = 20;
        boolean result = i1 == i2;
        System.out.println(result);

        int binaryNumber = 0b0000_0000_0000_0000_0000_0000_0001_1110;
        System.out.printf("비트 연산 4를 왼쪽으로 2칸 이동 = %d\n", binaryNumber << 2);
        System.out.printf("비트 연산 4를 오른쪽으로 2칸 이동 = %d\n", binaryNumber >> 2);
        System.out.printf("비트 연산 4를 오른쪽으로 2칸 이동후 빈공간을 모두 0으로 채운다. = %d\n", binaryNumber >>> 2);
        
        // 축약 연산자
        int contraction = 3;
        contraction <<= 2;
        System.out.println("축약 연산자 사용 = " + contraction);
        contraction >>= 2;
        System.out.println("축약 연산자 사용 = " + contraction);

        // 형변환 연산자
        double d1 = 10.0d;

        for (int i = 0; i < 10; i++) {
            d1 += 0.1;
            // 부동 소수점 처리 방식으로 인한 값 오차
            System.out.printf("\n원본 = " + d1);
            System.out.printf("\n수정본 = %.2f", d1);
            System.out.println();
        }

    }
}
