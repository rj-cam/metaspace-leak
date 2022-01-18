package com.example.metaspaceleak;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.RepeatedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class MetaspaceLeakControllerTest {

   @Autowired
   private MockMvc mvc;

   @RepeatedTest(value = 100)
   public void testTest() throws Exception {      
      this.mvc.perform(get("/test")
            .accept(MediaType.APPLICATION_JSON))
         .andExpect(status().isOk());
   }   
   
}
