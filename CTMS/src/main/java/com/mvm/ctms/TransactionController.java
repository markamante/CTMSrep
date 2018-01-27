package com.mvm.ctms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvm.ctms.model.Transaction;
import com.mvm.ctms.service.TransactionService;

@Controller
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;

    @Qualifier(value = "transactionService")
    public void setTransactionService(TransactionService ts) {
        this.transactionService = ts;
    }

	@RequestMapping(value = "/transactions", method = RequestMethod.GET)
    public String listTransaction(Model model) {
        model.addAttribute("transaction", new Transaction());
        model.addAttribute("listTransaction", this.transactionService.listTransaction());
        return "transactions";
    }
}