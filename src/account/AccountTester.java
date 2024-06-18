package account;

public class AccountTester {
    public static void main(String[] args) {
        //Account default_account = new Account();
        //Account person_account = new Account("123",0.0, "Shamima", "shm@mail.com", "123456");
        //System.out.println(default_account);
        Account person_account = new Account( "Shamima", "shm@mail.com", "123456");
        //System.out.println(person_account);
        Account shamima_copy = new Account(person_account);
        System.out.println(shamima_copy);

        assert(person_account.getCustomerName()).equals(shamima_copy.getCustomerName());

    }
}
