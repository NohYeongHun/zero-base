public class Sample{

    public static void main(String[] args) {
        
        //int -> 32 bit
        // 2진수 -> 00000000_00000000_00000000_00000000_
        // 16진수 -> ff_ff_ff_ff

        int i1 = 10; // 10진수
        int i2  = 0b10; // 2진수
        int i3  = 0x10; // 16진수
        int i4  = 010; // 8진수

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        
        // 2진수 간의 계산
        int k1 = 0b0000_0000_0000_0000_0000_0000_0000_1100;
        int k1_1 = 0b1111_1111_1111_1111_1111_1111_1111_0011; // k1에 대한 1의 보수 => 1은 0으로 뒤집고 0은 1로 뒤집는다.
        int k1_2 = k1_1 + 1;  // k1에 대한 1의 보수 +1 => k1에 대한 2의 보수
        int k2 = 0b1111_1111_1111_1111_1111_1111_1111_0100; // k1에 대한 2의 보수
        int k3 = k1 + k2;

        System.out.println("k1 = " + k1);
        System.out.println("k1에 대한 1의 보수 = " + k1_1);
        System.out.println("k1에 대한 2의 보수 = " + k1_2);
        System.out.println("k1에 대한 2의 보수 = " + k2);
        System.out.println("k3 = " + k3);

        int t1 = 0b0000_0000_0000_0000_0000_0000_0000_000;
        System.out.println(t1);
         
    }
}