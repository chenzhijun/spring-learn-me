package com.czj.helloworld;

import com.czj.helloworld.controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloWorldApplication.class)
@AutoConfigureMockMvc
public class HelloWorldApplicationTests {


    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }


    @Test
    public void postUserTest() throws Exception {

        RequestBuilder request = null;

//		request = MockMvcRequestBuilders.get("/add");
        request = MockMvcRequestBuilders.post("/add")
                .param("userId", "chenzhijun")
                .param("age", "12");
        mvc.perform(request).andExpect(new ResultMatcher() {
            @Override
            public void match(MvcResult mvcResult) throws Exception {
                MockHttpServletResponse response = mvcResult.getResponse();
                String contentAsString = response.getContentAsString();
                System.out.println(contentAsString);
            }
        });

        mvc.perform(request).andExpect(new ResultMatcher() {
            @Override
            public void match(MvcResult mvcResult) throws Exception {
                MockHttpServletResponse response = mvcResult.getResponse();
                int status = response.getStatus();
                System.out.println(status);
            }
        });
    }


}
