package com.lagou.bussiness.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lagou.bussiness.common.UserCoinAccount;
import com.lagou.bussiness.common.UserCoinAccountAllVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * @Author zxb
 * @Date 2021/9/7 20:04
 * @Version 1.0
 */
public interface UserCoinAccountMapper extends BaseMapper<UserCoinAccount> {


    /**
     * 查询用户的币用户情况
     *
     * @param userIdSet
     * @return
     */
    List<UserCoinAccountAllVO> queryUserCoinCount(@Param("userIdSet") Set<Integer> userIdSet);
}
