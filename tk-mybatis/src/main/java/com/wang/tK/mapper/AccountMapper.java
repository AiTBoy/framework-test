package com.wang.tK.mapper;

import com.wang.tK.domain.Account;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ExampleMapper;

@Repository
public interface AccountMapper extends BaseMapper<Account>, ExampleMapper<Account> {
}
