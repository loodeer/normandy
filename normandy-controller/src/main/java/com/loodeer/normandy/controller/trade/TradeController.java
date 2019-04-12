package com.loodeer.normandy.controller.trade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luzuheng
 * @date 2019-04-11 21:15
 */
@RestController
public interface TradeController {
    @GetMapping("/create")
    public String create(@RequestParam("tid") int tid);
}
