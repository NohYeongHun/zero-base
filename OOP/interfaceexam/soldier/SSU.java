package interfaceexam.soldier;

public class SSU extends 군인 implements 산악행군, 대테러진압, IBS{

    @Override
    public void 구보() {
        System.out.println("SSU 구보를 한다");        
    }

    @Override
    public void 완전군장하기() {
        System.out.println("SSU 완전군장");
    }

    @Override
    public void 행군하기() {
        System.out.println("SSU 행군하기");
        
    }

    @Override
    public void 사격하기() {
        System.out.println("SSU 사격하기");
    }

    @Override
    public void 인질구조() {                
        System.out.println("SSU 인질 구조");
    }

    @Override
    public void 헤드캐리어() {
        System.out.println("SSU 보트 머리위에 들기");
    }

    @Override
    public void 보트진수() {
        System.out.println("SSU 보트 진수");
        
    }
    
}
