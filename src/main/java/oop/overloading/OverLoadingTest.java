package oop.overloading;

public class OverLoadingTest {
    public static void main(String[] args) {
        SumCalc calc = new SumCalc();

        System.out.println(SumCalc.add(1, 2));
        System.out.println(SumCalc.add(1, 2, 3));
        int[] arr = {1, 2, 3, 4};
        System.out.println(calc.add(arr));
    }
}
