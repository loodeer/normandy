package com.loodeer.normandy.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.loodeer.normandy.facade.user.UserService;

/**
 * @author luzuheng
 * @date 2019-04-11 15:22
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public String login(int uid) {
        return "uid: " + uid + " login success!";
    }
}
