package com.farmers.css.helloworld.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.requestParameters;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureRestDocs(outputDir = "build/generated-snippets")
public class HelloWorldIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void greeting_shouldReturn200() throws Exception {
        mockMvc.perform(get("/greeting").accept(MediaType.APPLICATION_JSON)
                .param("name", "Cave Johnson"))
                .andExpect(status().isOk())
                .andDo(document("helloWorld",
                        requestParameters(
                                parameterWithName("name").description("A name to greet (optional)")
                        )));
    }
}
