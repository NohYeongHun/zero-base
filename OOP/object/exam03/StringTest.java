package object.exam03;

public class StringTest {
    public static void main(String[] args) {
        
        String url = "https://campus.co.kr";
        
        // length()
        System.out.println("=======length()==========");
        int length = url.length();
        System.out.println("문자열 길이 : " + length);
        

        //charAt()
        System.out.println("=======charAt()==========");
        for (int i = 0; i < url.length(); i++) {
            System.out.print(url.charAt(i) + " ");
        }
        System.out.println();
        
        //toCharArray()
        System.out.println("=======toCharArray()==========");
        for(char c : url.toCharArray()){
            System.out.print(c);
        }
        System.out.println();

        // contains, indexOf, lastIndexOf
        System.out.println(url.contains("http"));
        System.out.println(url.indexOf("."));
        System.out.println(url.lastIndexOf("."));

        // toUpperCase(), toLowerCase()
        System.out.println("str".toUpperCase());
        System.out.println("STR".toLowerCase());

        // trim() => 공백 제거
        String trimTest = " hi ";
        System.out.println("prev trim() : " + trimTest);
        System.out.println("prev trim() : " + trimTest.trim());

    }
}
