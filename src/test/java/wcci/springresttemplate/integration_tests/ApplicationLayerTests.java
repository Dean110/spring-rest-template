package wcci.springresttemplate.integration_tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationLayerTests {
	@Autowired
	MockMvc mockMvc;
	
	@Test
    public void loadingTestContext(){

    }
}
