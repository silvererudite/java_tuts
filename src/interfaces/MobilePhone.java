package interfaces;

public class MobilePhone implements ITelephone{

    private boolean isRinging;
    private int phoneNum;
    private boolean isOn = false;

    MobilePhone(int phoneNum){
        this.phoneNum = phoneNum;
    }
    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Powered on");
    }

    @Override
    public void dial(int phoneNum) {
        if(isOn) {
            System.out.println("Ringing " + phoneNum);
        }else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {

        if(isRinging){
            System.out.println("Answering desk phone");
            isRinging = !isRinging;
        }
    }

    @Override
    public void makeCall(int phoneNum) {
        if(phoneNum == this.phoneNum && isOn){
            isRinging = true;
            System.out.println("Ring ring");
        }else{
            isRinging = false;
        }

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
