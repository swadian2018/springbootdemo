package demo.service.serviceImpl;


import com.github.pagehelper.PageHelper;
import demo.entity.User;
import demo.service.UserService;
import demo.utils.LogUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void before(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        LogUtils.info("单元测试开始执行...");
    }

    @Test
    public void selectUser() throws Exception {
        mockMvc.perform(
                post("http://localhost:8080/demo/User/getUser")
                .contentType(MediaType.APPLICATION_JSON_UTF8) // 传参格式
                .content("{\"name\":\"xiaohong\"}") // JSONc 传参
        )
                .andExpect(status().isOk()) // 添加断言
                .andDo(MockMvcResultHandlers.print()) // 打印操作
                .andReturn();
    }

    @After
    public void after(){
        LogUtils.info("单元测试执行结束...");
    }
}
