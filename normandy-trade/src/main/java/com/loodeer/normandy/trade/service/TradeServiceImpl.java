package com.loodeer.normandy.trade.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.loodeer.normandy.facade.trade.TradeService;

/**
 * @author luzuheng
 * @date 2019-04-11 20:49
 */
@Service(version = "1.0.0")
public class TradeServiceImpl implements TradeService {
    @Override
    public String create(int tid) {
        return "id: " + tid + " create success!";
    }
}
