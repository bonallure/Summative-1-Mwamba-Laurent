package com.company.summative1mwambalaurent.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by bonallure on 10/4/21
 */
@RunWith(SpringRunner.class)
@WebMvcTest(Magic8BallAPI.class)
public class Magic8BallAPITest {

    // wiring in the MockMvc objects
    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUp(){

    }

    @Test
    public void getAnswer() throws Exception{

        String question = "How am I supposed to know what to write?";

        // ACT
        mockMvc.perform(
                post("/magic")
                        .content(question)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isOk());
    }
}