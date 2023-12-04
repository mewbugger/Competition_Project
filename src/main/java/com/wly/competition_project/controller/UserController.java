package com.wly.competition_project.controller;


import com.wly.competition_project.dao.entity.UserDO;
import com.wly.competition_project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制层
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/competition_project/user")
    public List<UserDO> getUserByList() {
        return userService.getUserByList();
    }
}
