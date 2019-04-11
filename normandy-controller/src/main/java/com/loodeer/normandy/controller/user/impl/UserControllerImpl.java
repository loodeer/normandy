package com.loodeer.normandy.controller.user.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.loodeer.normandy.controller.user.UserController;
import com.loodeer.normandy.facade.user.UserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luzuheng
 * @date 2019-04-11 16:19
 */
@RestController
public class UserControllerImpl implements UserController {
    
    @Reference(version = "1.0.0")
    private UserService userService;
    
    @Override 
    public String login(int uid) {
        return userService.login(uid);
    }
}
