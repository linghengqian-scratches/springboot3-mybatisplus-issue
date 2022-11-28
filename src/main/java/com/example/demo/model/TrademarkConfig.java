package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("trademark_configs")
public class TrademarkConfig extends UniBaseModel<TrademarkConfig, Long> {

    private String domain;

    private String loginLogo;
}
