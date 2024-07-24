package interfaces;

public class DeskPhone implements ITelephone{

    boolean isRinging;
    int phoneNum;
    DeskPhone(int phoneNum){
        this.phoneNum = phoneNum;
    }
    @Override
    public void powerOn() {
        System.out.println("No action taken");
    }

    @Override
    public void dial(int phoneNum) {
        System.out.println("Ringing "+ phoneNum);
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
        if(phoneNum == this.phoneNum){
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
