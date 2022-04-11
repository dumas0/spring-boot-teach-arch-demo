package com.dumas.sbta.tk.mybatis.mapper;

import com.dumas.sbta.tk.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/05 14:51
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据用户名统计（TODO 假设它是一个很复杂的SQL）
     *
     * @param username 用户名
     * @return 统计结果
     */
    int countByUsername(@Param("username") String username);
}
