package com.abuabdul.dobiztext.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main Landing controller for the doBizText application
 * 
 * @author abuabdul
 *
 */
@Controller
public class DoBizTextOverviewController {

	private static final Logger log = LogManager.getLogger(DoBizTextOverviewController.class.getName());

	@RequestMapping("/landing/doBizTextOverview.go")
	public String overviewPage() {
		log.debug("Entering overviewPage() in the DoBizTextOverviewController");
		return "overview";
	}

}
