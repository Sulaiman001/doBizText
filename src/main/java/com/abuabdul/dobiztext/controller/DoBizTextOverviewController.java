package com.abuabdul.dobiztext.controller;

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

	@RequestMapping("/landing/doBizTextOverview.go")
	public String overviewPage() {
		return "overview";
	}

}
