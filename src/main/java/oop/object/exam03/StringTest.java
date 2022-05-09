package oop.object.exam03;

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
        
        final String Furl = "https://Campus.co.kr";
        if(url.equals(Furl)){
            System.out.println("equals() 메서드는 대소문자 구분이 안 된다.");
        }else{
            System.out.println("equals() 메서드는 대소문자 구분이 된다.");
        }

        if(url.equalsIgnoreCase(Furl)){
            System.out.println("equalsIgnoreCase() 메서드는 대소문자 구분을 무시한다.");
        }else{
            System.out.println("equalsIgnoreCase() 메서드는 대소문자 구분이 된다.");
        }


        String url2 = "http://naver.com/news/tv/sbs";
        // name,  tv,  sbs
        // 분류  매체 방송국
        // new, radio, kbs

        String[] url2List = url2.replace("http://naver.com/", "").split("/");
        for(String url2Str : url2List){
            System.out.print(url2Str + " ");
        }
        System.out.println();
        System.out.println("분류 : " + url2List[0]);
        System.out.println("매체 : " + url2List[1]);
        System.out.println("방송국 : " + url2List[2]);

        //concat() => 합치기
        System.out.println(url2.concat("/index.html"));
        System.out.println(url2 + "/index.html");

        //substring()

        System.out.println(url.substring(8, 17));

        //ValueOf()
        String v1 = String.valueOf(12);
        Integer n1 = Integer.valueOf(v1);
        System.out.println(n1);

        
        

    }
}
