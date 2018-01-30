package com.mvm.ctms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvm.ctms.model.Payee;
import com.mvm.ctms.service.PayeeService;

@Controller
public class PayeeController {
	
	@Autowired
	private PayeeService payeeService;

    @Qualifier(value = "payeeService")
    public void setPayeeService(PayeeService as) {
        this.payeeService = as;
    }

	@RequestMapping(value = "/payees", method = RequestMethod.GET)
    public String listPayee(Model model) {
        model.addAttribute("payee", new Payee());
        model.addAttribute("listPayee", this.payeeService.listPayee());
        return "payees";
    }
	
}