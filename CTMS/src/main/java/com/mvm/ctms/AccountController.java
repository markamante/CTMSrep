package com.mvm.ctms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvm.ctms.model.Accounts;
import com.mvm.ctms.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService accountService;

    @Qualifier(value = "accountService")
    public void setAccountService(AccountService as) {
        this.accountService = as;
    }

	@RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public String listAccounts(Model model) {
        model.addAttribute("account", new Accounts());
        model.addAttribute("listAccount", this.accountService.listAccount());
        return "accounts";
    }
	
}