package inheritanceExam.exam01.a1;

import java.util.Calendar;

public class SavingAccount extends Account{
    
    public void setValue(){

        name = "account";
        accountNumber = 12345;
        date = Calendar.getInstance().getTime();
        //super.price = 1000; // private => x
    }
}
