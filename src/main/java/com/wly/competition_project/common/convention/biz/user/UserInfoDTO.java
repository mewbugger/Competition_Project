package com.wly.competition_project.common.convention.biz.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfoDTO {

    /**
     * 用户ID
     */
    //@JSONField(name = "id")
    private String id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户账号
     */
    private String account;
}
