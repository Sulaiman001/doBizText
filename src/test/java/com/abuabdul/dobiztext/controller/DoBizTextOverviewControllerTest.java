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

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author abuabdul
 *
 */
public class DoBizTextOverviewControllerTest {

	@InjectMocks
	private DoBizTextOverviewController doBizTextOverviewController;

	private MockMvc mockMvc;

	@BeforeMethod
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(doBizTextOverviewController).build();
	}

	@Test(groups = "integration")
	public void testOverviewPage() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/landing/doBizTextOverview.go"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
