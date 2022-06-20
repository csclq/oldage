package com.example.demo3.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Dictionary {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer type;
    private String name;
    private String remark;
    @TableField(fill = FieldFill.INSERT)
    private Integer createdAt;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Integer updatedAt;
}
