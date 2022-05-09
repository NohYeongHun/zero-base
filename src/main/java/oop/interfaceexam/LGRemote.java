package oop.interfaceexam;

public class LGRemote implements RemoteController, Call{


    // Call Interface
    public void answerCall(){
        System.out.println("전화를 받아 줍니다.");
    }

    // Remote Interface
    public void powerOn(){
        System.out.println("엘지 티비 리모콘 전원 켜기");
    }

    public void powerOff(){ 
        System.out.println("엘지 티비 리모콘 전원 끄기");
    }
}
