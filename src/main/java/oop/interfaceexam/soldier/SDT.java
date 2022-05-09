package oop.interfaceexam.soldier;

public class SDT extends 군인 implements IBS, 대테러진압, 산악행군{

    @Override
    public void 구보() {
        System.out.println("SDT가 구보를 한다");        
    }

    @Override
    public void 완전군장하기() {
        System.out.println("SDT 완전군장");
    }

    @Override
    public void 행군하기() {
        System.out.println("SDT 행군하기");
        
    }

    @Override
    public void 사격하기() {
        System.out.println("SDT 사격하기");
    }

    @Override
    public void 인질구조() {                
        System.out.println("SDT 인질 구조");
    }

    @Override
    public void 헤드캐리어() {
        System.out.println("SDT 보트 머리위에 들기");
    }

    @Override
    public void 보트진수() {
        System.out.println("SDT 보트 진수");
        
    }
    
}
