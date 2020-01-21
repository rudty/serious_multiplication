package org.rudtyz.serious.multiplication.controller;

import org.junit.jupiter.api.Test;
import org.rudtyz.serious.multiplication.MultiplicationController;
import org.rudtyz.serious.multiplication.service.business.IntegerMultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class MultiplicationControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void 결과_보기_9_9() throws Exception {
        mockMvc.perform(get("/")
                .param("lhs", "9")
                .param("rhs", "9"))
                .andExpect(handler().methodName("index"))
                .andExpect(status().isOk())
                .andExpect(content().string("81"))
                .andDo(print());
    }

    @Test
    public void 결과_보기_2_1_2_1() throws Exception {
        mockMvc.perform(get("/double")
                .param("lhs", "2.1")
                .param("rhs", "2.1"))
                .andExpect(handler().methodName("doubleMultiplication"))
                .andExpect(status().isOk())
                .andExpect(content().string("4.41"))
                .andDo(print());
    }
}
