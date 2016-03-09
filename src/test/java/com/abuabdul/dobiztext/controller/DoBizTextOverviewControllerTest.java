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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author abuabdul
 *
 */
public class DoBizTextOverviewControllerTest {

	@InjectMocks
	private DoBizTextOverviewController doBizTextOverviewController;

	private MockMvc mockMvc;

	@BeforeClass
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
		mockMvc = standaloneSetup(doBizTextOverviewController).build();
	}

	@Test(groups = "integration")
	public void testOverviewPage() throws Exception {
		mockMvc.perform(post("/landing/overview.go")).andExpect(status().isOk()).andExpect(view().name("overview"));
	}

	@Test(groups = "integration")
	public void testContactUsPage() throws Exception {
		mockMvc.perform(post("/landing/contactus.go")).andExpect(status().isOk()).andExpect(view().name("contactus"));
	}

	@Test(groups = "integration")
	public void testAboutUsPage() throws Exception {
		mockMvc.perform(post("/landing/aboutus.go")).andExpect(status().isOk()).andExpect(view().name("aboutus"));
	}
}
