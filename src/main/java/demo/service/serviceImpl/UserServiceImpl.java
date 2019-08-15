package demo.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import demo.entity.User;
import demo.mapper.UserMapper;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/7/6/006 20:22
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserByName(User user) {
        PageHelper.startPage(1,2);
        List<User> users = userMapper.selectUserByName(user);
        return users;
    }

}
