package inheritanceExam.exam01.a1;

import java.util.Calendar;

public class SavingAccountTest {
    public static void main(String[] args) {

        Account account1 = new Account();
        account1.date = Calendar.getInstance().getTime();
        account1.accountNumber = 1000;
        account1.name = "account";
        //account1.price = 1000; // private => x


    }
}
