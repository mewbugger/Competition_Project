package com.wly.competition_project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wly.competition_project.common.database.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 附件类实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("annex")
public class AnnexDO extends BaseDO {

    /**
     * 附件id
     */
    private Long id;

    /**
     * 附件名称
     */
    private String fileName;

    /**
     * 附件地址
     */
    private String filePath;

    /**
     * 竞赛id
     */
    private Long cid;

    /**
     * 队伍id
     */
    private Long tid;
}
