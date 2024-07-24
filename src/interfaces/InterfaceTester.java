package interfaces;

public class InterfaceTester {
    public static void main(String[] args) {
        ITelephone dummyPhone;
        //DeskPhone dummyPhone;
        dummyPhone = new DeskPhone(999);
        dummyPhone.powerOn();
        dummyPhone.makeCall(999);
        dummyPhone.answer();

        System.out.println("===============================");
        dummyPhone = new MobilePhone(123456789);
        dummyPhone.powerOn();
        dummyPhone.makeCall(123456789);
        dummyPhone.answer();
    }
}
