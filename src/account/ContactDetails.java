package account;

public class ContactDetails {
    private final String email;
    private final String phoneNum;

    public ContactDetails(String email, String phoneNum){
        if (email == null || phoneNum == null) {
            throw new IllegalArgumentException("Email and phone cannot be null");
        }
        this.email = email;
        this.phoneNum = phoneNum;
    }
}
