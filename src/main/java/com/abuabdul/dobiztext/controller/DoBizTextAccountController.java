package com.abuabdul.dobiztext.controller;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/secure")
@Controller
public class DoBizTextAccountController {

	private static final Logger log = LogManager.getLogger(DoBizTextAccountController.class.getName());

	@RequestMapping(value = "/account/addCustomers.go")
	public String accountAddCustomers(ModelMap model, HttpSession session) {
		log.debug("Entering accountAddCustomers() in the DoBizTextAccountController");
		// try {
		// model.addAttribute("resourceTaskTrackerForm", new
		// ResourceTask());
		return "add/view/accounts";
		/*
		 * } catch (DoBizTextServiceException dbtse) { log.debug(
		 * "DoBizTextException - " + dbtse.getMessage()); throw new
		 * DoBizTextException(dbtse.getMessage()); }
		 */
	}

}
