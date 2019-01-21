package cn.li.dao;

import cn.li.entity.Permission;
import cn.li.entity.Role;

import java.util.List;

/**
 * @auther li
 * @date 2018/7/18
 */
public interface RoleDao {

    void correlationPermissions(Long roleId, Long[] permissionIds);

    void uncorrelationPermissions(Long roleId, Long[] permissionIds);

    Role findById(Long id);
    
    void create(Role role);

    void delete(Long id);

    List<Role> findAll();

    List<Permission> findRolePermissionByRoleId(Long id);

    List<Permission> findPermissionByRoleId(Long id);

    void update(Role role);

    void deleteAllRolePermissions(Long id);

    void updateUserRole_Id(Role role);
}
