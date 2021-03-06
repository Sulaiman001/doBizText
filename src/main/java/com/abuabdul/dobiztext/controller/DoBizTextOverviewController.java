/*
 * Copyright 2013-2016 abuabdul.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
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

	@RequestMapping("/landing/overview.go")
	public String overviewPage() {
		log.debug("Entering overviewPage() in the DoBizTextOverviewController");
		return "overview";
	}

	@RequestMapping("/landing/contactus.go")
	public String contactusPage() {
		log.debug("Entering contactusPage() in the DoBizTextOverviewController");
		return "contactus";
	}

	@RequestMapping("/landing/aboutus.go")
	public String aboutusPage() {
		log.debug("Entering aboutusPage() in the DoBizTextOverviewController");
		return "aboutus";
	}

}
