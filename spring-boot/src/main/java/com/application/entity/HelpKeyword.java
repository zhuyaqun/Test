package com.application.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "help_keyword")
public class HelpKeyword {
    @TableId(value = "help_keyword_id",type = IdType.AUTO)
    private Integer helpKeywordId;
    private String name;
}
