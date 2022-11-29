package com.example.demo;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@MapperScan("com.example.demo")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@TableName("trademark_configs")
record TrademarkConfig(
        @TableId(value = "id", type = IdType.AUTO)
        Long id,
        @TableField(value = "created_at", fill = FieldFill.INSERT)
        Date createdAt,
        @TableField(value = "updated_at", fill = FieldFill.INSERT_UPDATE)
        Date updatedAt,
        String domain,
        String loginLogo
) {
    public TrademarkConfig(String domain) {
        this(null, null, null, domain, null);
    }
}

@Mapper
interface ITrademarkConfigDao extends BaseMapper<TrademarkConfig> {
}
