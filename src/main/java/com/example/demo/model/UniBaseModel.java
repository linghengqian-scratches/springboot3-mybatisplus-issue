package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * UniBaseModel
 * <p>
 *
 * @author uniscrm.net
 * @since 2022/5/24
 **/
@Data
public class UniBaseModel<T extends Model, ID_TYPE extends Serializable> extends Model {

    @TableId(value = "id", type = IdType.AUTO)
    protected ID_TYPE id;

    @TableField(value = "created_at", fill = FieldFill.INSERT)
    protected Date createdAt;

    @TableField(value = "updated_at", fill = FieldFill.INSERT_UPDATE)
    protected Date updatedAt;


    public ID_TYPE pkVal() {
        return this.getId();
    }
}
