package oop.classkinds.bufferbuilder;

public class StringBufferTest{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("홍")
            .append(System.lineSeparator())
            .append("학생")
            .append(System.lineSeparator())
            .append(20);
        System.out.println(sb.toString());
        
        String name = "홍길동";
        String dept = "학생";
        int age = 20;

        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("이름: %s",name))
            .append(System.lineSeparator())
            .append(String.format("학생: %s",dept))
            .append(System.lineSeparator())
            .append(String.format("나이: %d",age));
        System.out.println(sb2.toString());

        StringPlus sp = new StringPlus();
        sp.append(String.format("이름: %s",name))
            .line()
            .appendFormat("학생 : %s", dept)
            .line()
            .appendLine(String.format("이름: %s",name));
        System.out.println(sp.toString());
    }
}
