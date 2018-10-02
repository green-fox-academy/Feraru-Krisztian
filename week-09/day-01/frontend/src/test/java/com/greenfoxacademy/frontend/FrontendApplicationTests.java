package com.greenfoxacademy.frontend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FrontendApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }

    @Test
    public void doublingLoads() throws Exception {
        mockMvc.perform(get("/doubling").param("input", "1.5"))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void greeterNameLoads() throws Exception {
        mockMvc.perform(get("/greeter").param("name", "Chriss" ).param("title", "boss"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Chriss")));
    }

    @Test
    public void greeterTitleLoads() throws Exception {
        mockMvc.perform(get("/greeter").param("title", "boss"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title", is("boss")));
    }

    @Test
    public void greeterLoads() throws Exception {
        mockMvc.perform(get("/greeter").param("name", "Chriss" ).param("title", "boss"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Chriss, my dear boss!")));
    }

    @Test
    public void appandALoads() throws Exception {
        mockMvc.perform(get("/appenda/kuty"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.appended", is("kutya")));
    }
}
