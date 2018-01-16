package com.mvm.ctms;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvm.ctms.model.User;
import com.mvm.ctms.service.UserService;

@Controller
public class LoginController {
	//mramante start
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginForm() {
		return "/login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String verifyLogin(@RequestParam String userName, @RequestParam String password, HttpSession session, Model model) {
		User user = userService.loginUser(userName, password);
		if(user==null) {
			model.addAttribute("loginError", "Invalid Username or Password.");
			return "login";
		}
		session.setAttribute("loggedInUser", user);
		return "home";
		
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("loggedInUser");
		return "login";
	}
	//mramante end
	
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

	@RequestMapping(value = "/go_journal", method = RequestMethod.GET)
	public String goJournal() {
		return "redirect:journal";
	}

	@RequestMapping(value = "/go_transactions", method = RequestMethod.GET)
	public String goTrasactions() {
		return "redirect:transactions";
	}

	@RequestMapping(value = "/go_sysAd", method = RequestMethod.GET)
	public String goSysAd() {
		return "redirect:sysAd";
	}

	@RequestMapping(value = "/go_home", method = RequestMethod.GET)
	public String goHome() {
		return "redirect:home";
	}

}
