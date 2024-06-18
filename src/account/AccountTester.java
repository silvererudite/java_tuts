package account;

public class AccountTester {
    public static void main(String[] args) {
        //Account default_account = new Account();
        //Account person_account = new Account("123",0.0, "Shamima", new ContactDetails("shm@mail.com", "123456"));
        //System.out.println(default_account);

        // Creating the ContactDetails object
        ContactDetails shamimaContactDetails = new ContactDetails("shm@mail.com", "123456");

        // Creating an Account object using the ContactDetails
        Account person_account = new Account("Shamima", shamimaContactDetails);
        System.out.println(person_account);

        // Creating a copy of the Account object
        Account shamima_copy = new Account(person_account);
        System.out.println(shamima_copy);

        // Assertion to check if the customer names are the same
        assert(person_account.getCustomerName()).equals(shamima_copy.getCustomerName());

    }
}
