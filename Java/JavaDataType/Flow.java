public class Flow {
    public static void main(String[] args) {
        
        int iMax = 0x7f_ff_ff_ff + 1;
        System.out.println(iMax);

        int i1 = 0b0111_1111_1111_1111_1111_1111_1111_1111;
        int i2 = 0b1000_0000_0000_0000_0000_0000_0000_0000;
        /**
         * 오버 플로우
         * 값이 넘치는 경우 => 최대값에서 1을 더하면 값이 오히려 최소값으로 변함.
         */
        System.out.println(i1 + 1);
        /**
         * 언더 플로우
         * 값이 최소값보다 1을 빼주면 => 최대값으로 변한다.
         */
        System.out.println(i2 - 1);


        

    }
}
