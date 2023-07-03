package com.practice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.lang.annotation.Target;

/**
 * @Author G
 * @Date 2023/7/1 22:51
 * @PackageName:com.practice.entity
 * @ClassName: User
 * @Description: TODO
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class User implements Serializable {
    @TableId(type = IdType.AUTO)
    private int id;
    private String username;
    private String password;
}
