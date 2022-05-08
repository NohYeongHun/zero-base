package classkinds.mathc;

public class MathTest {
    public static void main(String[] args) {
        double d1 = 12.426;
        // 소수점 2째자리까지 표현
        // 하기위해서, 올림, 반올림, 버림
        // 12.43

        System.out.println(d1);
        System.out.println(Math.round(d1));
        System.out.println(Math.ceil(d1));
        System.out.println(Math.floor(d1));

        System.out.println("----------------");
        System.out.println(SmartMath.round(d1, 1));
        System.out.println(SmartMath.ceil(d1, 1));
        System.out.println(SmartMath.floor(d1, 1));
        System.out.println(SmartMath.distance(1, 1, 3, 3));
    }

}
