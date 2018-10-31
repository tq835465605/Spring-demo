package com.foxhis.chapter5;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class ServletTest {

	
	@Test
	public  void test() throws Exception  {
		// TODO Auto-generated method stub
         HelloController controller = new HelloController();
         MockMvc mockMvc=MockMvcBuilders.standaloneSetup(controller).build();
         mockMvc.perform(get("/")).andExpect(view().name("home"));
	}
	
	

	
}
