package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MybatisPlusSampleTest {
    @Autowired
    ITrademarkConfigDao trademarkConfigDao;

    @Test
    void testInsert() {
        TrademarkConfig trademarkConfig = new TrademarkConfig("test");
        List<TrademarkConfig> trademarkConfigs = trademarkConfigDao.selectList(new QueryWrapper<>(trademarkConfig));
        assertThat(trademarkConfigs.size()).isEqualTo(11);
    }
}