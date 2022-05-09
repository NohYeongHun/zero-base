package oop.interfaceexam;

public class RemoteTest {
    public static void main(String[] args) {
        
        SamSungRemote srm = new SamSungRemote();

        srm.listenMusic();
        srm.powerOn();
        srm.powerOff();


        LGRemote lg = new LGRemote();

        lg.answerCall();
        lg.powerOn();
        lg.powerOff();

    }
}
