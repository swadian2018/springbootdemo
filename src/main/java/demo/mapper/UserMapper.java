package demo.mapper;

import demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/7/6/006 19:41
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    List<User> selectUserByName(User user);

}
