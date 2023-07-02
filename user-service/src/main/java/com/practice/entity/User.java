package com.practice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public @Data class User {
    private String username;
    private String password;
}
