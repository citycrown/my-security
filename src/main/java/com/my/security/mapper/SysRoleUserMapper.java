package com.my.security.mapper;

import com.my.security.entity.SysRoleUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 类说明
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/4/3
 */
@Mapper
public interface SysRoleUserMapper {
    @Select("SELECT * FROM sys_role_user WHERE userId = #{userId}")
    List<SysRoleUserEntity> listByUserId(Long userId);
}
