package demo.cotroller;

import demo.entity.User;
import demo.service.UserService;
import demo.utils.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2019/7/6/006 20:25
 * @Version 1.0
 */
@RestController
public class UserController {

    /**
     * @RestController注解，相当于@Controller+@ResponseBody两个注解的结合,
     * 返回json数据不需要在方法前面加@ResponseBody注解
     * 但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
     */

    @Autowired
    private UserService userService;

    @RequestMapping("demo/User/selectUser")
    public Object selectUser(){
        User user = new User();
        user.setName("xiaohong");
        LogUtils.info("打印入参：{}",user);
        LogUtils.info("打印入参：this is the second");
        LogUtils.info("打印入参：this is the third");
        return userService.selectUserByName(user);
    }

    @RequestMapping("demo/User/getUser")
    public Object getUser(@RequestBody User user){
        return userService.selectUserByName(user);
    }
}
