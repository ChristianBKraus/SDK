//package jupiterpa.infrastructure;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
//import static org.junit.Assert.assertEquals;
//import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Date;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.test.context.support.WithMockUser;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import jupiterpa.infrastructure.mock.SDKTestApplication;
//import jupiterpa.infrastructure.mock.SDKTestController;
//import jupiterpa.infrastructure.mock.SDKTestEntity;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes=SDKTestApplication.class)
//@AutoConfigureMockMvc
//@WithMockUser(roles="ADMIN")
//@ActiveProfiles({"SDK-Test"})
//public class ClientTest { 
//	final String PATH = SDKTestController.PATH; 
//
//	@Autowired
//    private MockMvc mockMvc;
//    
//    @Test
//    public void testGET() throws Exception {
//    	mockMvc.perform(get(PATH))
//        .andExpect(status().isOk())
//        .andExpect(content().contentType(APPLICATION_JSON_UTF8))
//        .andExpect(jsonPath("$.value").value("Test"));
//    }
////    @Test
////    public void testPOST() throws Exception {
////    	SDKTestEntity entity = new SDKTestEntity("Test_New");
////
////    	mockMvc.perform( post(PATH).content(toJson(entity)).contentType(APPLICATION_JSON_UTF8) )
////        .andExpect(status().isOk());
////    	
////    	mockMvc.perform(get(PATH))
////        .andExpect(status().isOk())
////        .andExpect(content().contentType(APPLICATION_JSON_UTF8))
////        .andExpect(jsonPath("$.value").value("Test_New"));
////    }
//    private String toJson(Object object) throws JsonProcessingException {
//        return new ObjectMapper().writeValueAsString(object);
//    }
//}