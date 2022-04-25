package extendsexam;

public class Staff extends Human{
    private String privateValue;
    protected String protectedValue;

    public Staff(int age, String name, String privateValue, String protectedValue, int focus){
        /*
            상속받는 클래스는 기본적으로    
            super()를 통해 부모의 기본 생성자를 
            실행하는데 부모의 생성자가 오버로딩 되었을 때 
            상속받는 클래스는 super()를 부모의 생성자에 맞게
            재정의 해주어야 한다.
             
        */
        super(age, name, focus);
        System.out.println("Staff 생성자 호출");
        
        //상위 부모값
        this.privateValue = privateValue;
        this.protectedValue = protectedValue;
    }

    // 자신 클래스 내부와 같은 패키지 내에서 접근 가능
    void defaultPrint(){
        System.out.println("default 접근 지정자");
    }

    // 모든 클래스, 패키지에서 접근 가능.
    public void publicPrint(){
        System.out.println("public 접근 지정자");
    }

    public void privatePrintPublicMethod(){
        this.privateValuePrint();
    }
    // 해당 클래스 내부에서만 접근 가능.
    private void privateValuePrint(){
        System.out.println("private 접근 지정자 " + this.privateValue);
    }

    public void protectedValuePrint(){
        System.out.println("다른 패키지에서 protected 접근 지정자 출력 : " + super.name);
    }

    public void valuePrint(){
        System.out.println("age : " + this.age);
        System.out.println("name : " + this.name);
        System.out.println("age : " + this.privateValue);
    }

}
