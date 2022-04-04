public class Bit {
    
    public static void main(String[] args) {
        long l1 = 0b0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0001;
        long l2 = 0x00_00_00_00_00_00_00_01;
        System.out.println(l1);
        System.out.println(l2);
        
        // 정수형 int의 최대값 최소값?
        int i1 = 0b0111_1111_1111_1111_1111_1111_1111_1111;
        int i2 = 0b1000_0000_0000_0000_0000_0000_0000_0000;
        System.out.println(i1);
        System.out.println(i2);

        int il1 = Integer.MAX_VALUE;
        int il2 = Integer.MIN_VALUE;
        System.out.println(il1);
        System.out.println(il2);

        short s1 = 0b0000_0000_0000_1100;
        short s2 = (short) 0b1111_1111_1111_0100;
        System.out.println(s1);
        System.out.println(s2);

        short a1 = 10;
        short a2 = 20;
        short a3 = (short)(a1 + a2);
        System.out.println(a3);

        double d1 = 123.456789;
        double d2 = 1.23456789;
         
        System.out.println(d1);
        System.out.println(d2);

    }
}
