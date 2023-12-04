package com.wly.competition_project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wly.competition_project.dao.entity.UserDO;

import java.util.List;

/**
 * 用户类接口层
 */
public interface UserService extends IService<UserDO> {


    List<UserDO> getUserByList();
}
