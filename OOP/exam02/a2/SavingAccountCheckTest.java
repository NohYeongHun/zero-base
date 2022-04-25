package exam02.a2;

import exam01.a1.Account;

public class SavingAccountCheckTest {
    // 같은 패키지 - > x
    // 상속 - > x
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "newAccount";
        // scope
        // account1.date  // protected = > x
        // account1.accountNumber // default => x
        // account1.price // private => x
    }
    
}
