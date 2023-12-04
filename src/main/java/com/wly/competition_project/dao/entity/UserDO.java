package com.wly.competition_project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wly.competition_project.common.database.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户类实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("user")
public class UserDO extends BaseDO {

    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户账号
     */
    private String account;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户性别
     */
    private Integer gender;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户角色 0-管理员 1-学生 2-评审
     */
    private Integer userRole;
}
