package inheritanceExam.exam02.a2;

import java.util.Calendar;

import inheritanceExam.exam01.a1.SavingAccount;


public class SavingAccountCheck extends SavingAccount{
    
    public void valueCheck(){
        name = "savingAccount";
        date = Calendar.getInstance().getTime();
    }
}
