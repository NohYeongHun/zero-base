package oop.generictest;

public class GeMethodTest {
    public static void main(String[] args) {
        String[] names = {"java", "python", "C++", "C#", "JS"};
        Double[] scores = {1000.0, 980.0, 950.0, 900.0, 1000.0};

        GeMethod geMethod = new GeMethod();
        geMethod.print(names);
        geMethod.print(scores);

        GeMethod.print2(names);
        GeMethod.print2(scores);

        GeMethod.firstStringPrint("Java");

    }
}
