package interfaceexam.family;

public class Child implements Farther, Mother{

    @Override
    public void 집안일하기() {
        System.out.println("빨래하기");
        System.out.println("밥하기");
        System.out.println("청소하기");
        
    }

    @Override
    public void 형광등갈기() {
        System.out.println("형광등 갈기");
    }

    @Override
    public void 세차하기() {
        System.out.println("세차하기");
    }
    
}
