package com.spring4all.entity;

import lombok.Data;

@Data
public class UserEntity {

    private Long id;

    /**
     * 账号
     */
    private String userName;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 权限
     */
    private String roles;
}
