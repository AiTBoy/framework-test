package com.wang.tK.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Table(name = "t_account")
public class Account {
    @Id
    private Integer id;

    private String uuid;

    private String account;

    private String password;

    @Column(name = "createdTime")
    private LocalDateTime createdTime;

    @Column(name = "updateTime")
    private LocalDateTime updateTime;

    private Integer deleted;
}
