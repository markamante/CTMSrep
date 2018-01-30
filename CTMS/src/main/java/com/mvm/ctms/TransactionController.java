package com.mvm.ctms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import com.mvm.ctms.model.Transaction;
import com.mvm.ctms.service.TransactionService;
import com.mvm.ctms.service.AccountService;
import com.mvm.ctms.service.PayeeService;


@Controller
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private PayeeService payeeService;

    @Qualifier(value = "transactionService")
    public void setTransactionService(TransactionService ts) {
        this.transactionService = ts;
    }

	@RequestMapping(value = "/transactions", method = RequestMethod.GET)
    public String listTransaction(Model model) {
        model.addAttribute("transaction", new Transaction());
        model.addAttribute("listTransaction", this.transactionService.listTransaction());
        model.addAttribute("listAccount", accountService.listAccount());
        model.addAttribute("listPayee", payeeService.listPayee());
        return "transactions";
    }
	
	@RequestMapping(value = "/addtransaction", method = RequestMethod.POST)
    public String addTransaction(@ModelAttribute("transaction") Transaction t) {
		this.transactionService.addTransaction(t);

        return "redirect:/transactions";

    }
	
}