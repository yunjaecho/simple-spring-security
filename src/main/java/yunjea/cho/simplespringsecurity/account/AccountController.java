package yunjea.cho.simplespringsecurity.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService service;

    @GetMapping("/create")
    public Account create(Account account) {
        return service.save(account);
    }
}
