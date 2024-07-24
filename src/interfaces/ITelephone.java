package interfaces;

public interface ITelephone {
    public void powerOn();
    public void dial(int phoneNum);
    public void answer();
    public void makeCall(int phoneNum);
    public boolean isRinging();
}
