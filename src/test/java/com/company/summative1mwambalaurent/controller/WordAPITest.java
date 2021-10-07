package com.company.summative1mwambalaurent.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * Created by bonallure on 10/4/21
 */
@RunWith(SpringRunner.class)
@WebMvcTest(WordAPI.class)
public class WordAPITest {

    // wiring in the MockMvc objects
    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUp(){

    }

    @Test
    public void getWordDefinition() throws Exception{


        // ACT
        MvcResult result1 = mockMvc.perform(
                get("/word")
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isOk()).andReturn();

        MvcResult result2 = mockMvc.perform(
                get("/word")
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isOk()).andReturn();
        String response1 = result1.getResponse().getContentAsString();
        String response2 = result2.getResponse().getContentAsString();

        // testing the responses are different
        Assert.assertNotEquals(response1, response2);
    }
}