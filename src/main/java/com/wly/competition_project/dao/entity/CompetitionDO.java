package com.wly.competition_project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wly.competition_project.common.database.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * 竞赛类实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("competition")
public class CompetitionDO extends BaseDO {

    /**
     * 竞赛id
     */
    private Long id;

    /**
     * 竞赛名称
     */
    private String name;

    /**
     * 竞赛类别
     */
    private String category;

    /**
     * 竞赛等级
     */
    private String competitionLevel;

    /**
     * 截止时间
     */
    private Date expireTime;
}
