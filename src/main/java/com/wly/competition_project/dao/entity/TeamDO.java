package com.wly.competition_project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wly.competition_project.common.database.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 队伍类实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("team")
public class TeamDO extends BaseDO {
    /**
     * 队伍id
     */
    private Long id;

    /**
     * 队伍名称
     */
    private String name;

    /**
     * 队伍密码
     */
    private String password;

    /**
     * 队长id
     */
    private Long captionId;

    /**
     * 队员id列表
     */
    private String memberIds;

    /**
     * 最大人数
     */
    private Integer maxNum;
}
