package interfaceexam;

public class SamSungRemote implements RemoteController{
    
    public void listenMusic(){
        System.out.println("음악 들려주기");
    }

    @Override
    public void powerOn(){
        System.out.println("삼성 리모콘 전원 켜기");
    }

    @Override
    public void powerOff(){
        System.out.println("삼성 리모콘 전원 끄기");
    }
}
