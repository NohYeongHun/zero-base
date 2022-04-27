package interfaceexam.soldier;

public class UDT extends 군인 implements 대테러진압, 산악행군, IBS{

    @Override
    public void 구보() {
        System.out.println("UDT 구보를 한다");        
    }

    @Override
    public void 완전군장하기() {
        System.out.println("UDT 완전군장");
    }

    @Override
    public void 행군하기() {
        System.out.println("UDT 행군하기");
        
    }

    @Override
    public void 사격하기() {
        System.out.println("UDT 사격하기");
    }

    @Override
    public void 인질구조() {                
        System.out.println("UDT 인질 구조");
    }

    @Override
    public void 헤드캐리어() {
        System.out.println("UDT 보트 머리위에 들기");
    }

    @Override
    public void 보트진수() {
        System.out.println("UDT 보트 진수");
        
    }
    
}
