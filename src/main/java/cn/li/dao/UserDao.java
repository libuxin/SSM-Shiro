package cn.li.dao;

import cn.li.entity.Permission;
import cn.li.entity.Role;
import cn.li.entity.User;

import java.util.List;

/**
 * @auther li
 * @date 2018/7/18
 */
public interface UserDao {

    void correlationRoles(Long userId, Long... roleIds);

    void uncorrelationRoles(Long userId, Long... roleIds);

    List<Role> findRoles(String username);

    List<Permission> findPermissions(String username);

    void create(User user);

    void delete(Long id);

    void update(User user);

    List<User> findAll();

    User findByName(String username);

    User findById(Long id);

    void deleteAllUserRoles(Long id);
}
