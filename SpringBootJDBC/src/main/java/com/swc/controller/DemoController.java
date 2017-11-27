package com.swc.controller;

import com.swc.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by chao on 2017-11-27.
 */
@RestController
@RequestMapping("/account")
public class DemoController {

    @Autowired
    AccountController accountController;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> findList() {

        return accountController.findAccountList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public int update(@PathVariable("id") String id, @RequestParam(value = "name", required = true) String name, @RequestParam(value = "money") double money) {
        Account a =new Account();
        a.setId(id);
        a.setName(name);
        a.setMoney(money);
        return accountController.update(a);
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  Account getAccountById(@PathVariable("id") int id){
        return accountController.findAccountById(id);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public  int postAccount( @RequestParam(value = "name")String name,
                                @RequestParam(value = "money" )double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        return accountController.add(account);

    }
}
