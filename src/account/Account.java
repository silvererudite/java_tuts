package account;

public class Account {
    private String number;
    private double balance;
    private String customerName;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
    private ContactDetails contactDetails;

    public Account(){
        this("123", 0.0, "default", new ContactDetails("default@mail.com", "123456"));
        System.out.println("Empty constructor called");
    }
    public Account(String number, double balance, String customerName, ContactDetails contactDetails){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.contactDetails = contactDetails;
        System.out.println("constructor with params called");
    }

    public Account(String customerName, ContactDetails contactDetails) {
        this("9999", 0.0, customerName, contactDetails);
    }

    // copy constructor
    public Account(Account account){
        this("111", 100.0, account.customerName, account.contactDetails);
    }

    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $"+depositAmount +" has been made new balance is "+balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", customerContactDetail='" + getContactDetails() + '\'' +
                '}';
    }
}
