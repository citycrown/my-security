package com.my.security.mapper;

import com.my.security.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface SysUserMapper {

    /**
     * 根据ID查询
     * <p>
     * @param id
     * @return:
     * @throws:
     * @author: 陈冕
     * @version: 1.0.0
     * @date: 2019/4/3 14:27
     */
    SysUserEntity selectById(Integer id);

    /**
     * 根据用户名查询
     * <p>
      * @param name
     * @return:
     * @throws:
     * @author: 陈冕
     * @version: 1.0.0
     * @date: 2019/4/3 14:29
     */
    SysUserEntity selectByName(String name);

    int deleteByPrimaryKey(Integer id);

    int insert(SysUserEntity record);

    int insertSelective(SysUserEntity record);

    SysUserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserEntity record);

    int updateByPrimaryKey(SysUserEntity record);
}