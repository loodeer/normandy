package com.loodeer.normandy.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luzuheng
 * @date 2019-04-11 16:16
 */
@RestController
public interface UserController {
    @GetMapping("/login")
    public String login(@RequestParam("uid") int uid);
}
