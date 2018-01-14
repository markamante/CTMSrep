package com.mvm.ctms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	   public String index() {
	      return "redirect:/";
	   }
	   @RequestMapping(value = "/redirect", method = RequestMethod.GET)
	   public String redirect() {
	      return "redirect:journal";
	   }

	   @RequestMapping(value = "/journal", method = RequestMethod.GET)
	   public String journal() {
	      return "Journal";
	   }
	   @RequestMapping(value = "/transactions", method = RequestMethod.GET)
	   public String transactions() {
	      return "Transactions";
	   }
	   @RequestMapping(value = "/sysAd", method = RequestMethod.GET)
	   public String sysAd() {
	      return "SysAd";
	   }

	   @RequestMapping(value = "/go_journal",method = RequestMethod.GET)
	   public String goJournal() {
	      return "redirect:journal";
	   }
	   
	   @RequestMapping(value = "/go_transactions",method = RequestMethod.GET)
	   public String goTrasactions() {
	      return "redirect:transactions";
	   }

	   @RequestMapping(value = "/go_sysAd",method = RequestMethod.GET)
	   public String goSysAd() {
	      return "redirect:sysAd";
	   }

	   @RequestMapping(value = "/go_home",method = RequestMethod.GET)
	   public String goHome() {
	      return "redirect:home";
	   }
		
}
