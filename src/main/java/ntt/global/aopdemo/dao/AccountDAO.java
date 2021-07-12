package ntt.global.aopdemo.dao;

import ntt.global.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO
{
    public void addAccount(Account account, boolean vipFlag)
    {
        System.out.println(getClass() + " : Doing my db work: add account \n");
    }
}
