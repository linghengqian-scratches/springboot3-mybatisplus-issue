package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.example.demo.mapper.IPlatformTrademarkConfigDao;
import com.example.demo.model.TrademarkConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@MybatisPlusTest
class MybatisPlusSampleTest {

    @Autowired
    private IPlatformTrademarkConfigDao trademarkConfigDao;

    @Test
    void testInsert() {
        TrademarkConfig trademarkConfig = new TrademarkConfig();
        trademarkConfig.setDomain("");
        trademarkConfig = trademarkConfigDao.selectOne(new QueryWrapper<>(trademarkConfig));

        assertThat(trademarkConfig.getId()).isNotNull();
    }
}