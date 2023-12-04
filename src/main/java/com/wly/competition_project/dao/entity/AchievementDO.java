package com.wly.competition_project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wly.competition_project.common.database.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 得分类实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("achievement")
public class AchievementDO extends BaseDO {

    private Long id;

    /**
     * 综合分数
     */
    private Integer totalScore;

    /**
     * 材料分数
     */
    private Integer annexScore;

    /**
     * 答辩分数
     */
    private Integer replyScore;

    /**
     * 评审id
     */
    private Long uid;
}
