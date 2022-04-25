package extendsexam;

class Human{
    public int age;
    protected String name;
    private int focus;
    
    Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    Human(int age, String name, int focus){
        this.age = age;
        this.name = name;
        this.focus = focus;
        System.out.println("Human 생성자 호출");
    }

    // 자식 클래스 또는 같은 패키지 내에서 접근 가능.
    protected void protectedPrintSpec(){
        System.out.println("상속받은 클래스의 focus 변수 : " + this.focus);
    }

}

