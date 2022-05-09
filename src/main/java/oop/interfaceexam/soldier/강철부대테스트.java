package oop.interfaceexam.soldier;

public class 강철부대테스트 {
    
    public static void main(String[] args) {

        SDT 김민수 = new SDT();
        SSU 황충원 = new SSU();
        UDT 육준서 = new UDT();
        칠공칠 이진봉 = new 칠공칠();
        특전사 박준우 = new 특전사();
        해병수색대 오종혁 = new 해병수색대();

        IBS[] IBS목록 = {김민수, 황충원, 육준서, 이진봉, 박준우, 오종혁};
        
        for(IBS ibs : IBS목록){
            ibs.헤드캐리어();
        }
    }
}
