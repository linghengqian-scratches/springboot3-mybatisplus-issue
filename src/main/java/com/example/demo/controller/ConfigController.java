package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.mapper.ITrademarkConfigDao;
import com.example.demo.model.TrademarkConfig;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/configs")
public class ConfigController {

    @Autowired
    private ITrademarkConfigDao trademarkConfigDao;

    /**
     * 登录页信息
     *
     * @return
     */
    @GetMapping(value = "/trademark")
    public TrademarkConfig getTrademark(HttpServletRequest request,
                                        @RequestParam(value = "domain") String domain) {

        TrademarkConfig trademarkConfig = new TrademarkConfig();
        trademarkConfig.setDomain(domain);
        trademarkConfig = trademarkConfigDao.selectOne(new QueryWrapper<>(trademarkConfig));

        if (trademarkConfig == null) {
            return null;
        }

        return trademarkConfig;
    }
}
