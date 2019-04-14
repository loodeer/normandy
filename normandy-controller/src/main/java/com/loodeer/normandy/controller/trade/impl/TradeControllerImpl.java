package com.loodeer.normandy.controller.trade.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.loodeer.normandy.controller.trade.TradeController;
import com.loodeer.normandy.facade.trade.TradeService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luzuheng
 * @date 2019-04-11 21:16
 */
@RestController
public class TradeControllerImpl implements TradeController {

    @Reference(version = "1.0.0")
    private TradeService tradeService;

    @Override public String create(int tid) {
        return tradeService.create(tid);
    }
}
