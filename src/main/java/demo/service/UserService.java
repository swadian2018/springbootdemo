package demo.service;

import demo.entity.User;

import java.util.List;

public interface UserService {

    List<User> selectUserByName(User user);

}
