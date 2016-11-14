package web.test;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cn.smile.springuser.controller.HomeController;

public class AllControllTest {
    @Test
    public void testHome() throws Exception{
        HomeController homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();  //搭建MockMvc
        mockMvc.perform(MockMvcRequestBuilders.get("/"))                
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }
}
