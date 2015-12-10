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
