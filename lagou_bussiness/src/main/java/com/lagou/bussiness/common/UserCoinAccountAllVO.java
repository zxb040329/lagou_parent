package com.lagou.bussiness.common;

import java.math.BigDecimal;

/**
 * @Author zxb
 * @Date 2021/9/7 20:01
 * @Version 1.0
 */
public class UserCoinAccountAllVO {
    /**
     * 币的简写
     */
    private String coinName;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 所有持有类型，资金类型，1-币币，2-法币，3-理财，4-币汇，5-合约',
     */
    private BigDecimal amountSum;
    /**
     * 所有持有类型，资金类型，1-币币，2-法币，3-理财，4-币汇，5-合约',
     */
    private BigDecimal amountSumUsdt;

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getAmountSum() {
        return amountSum;
    }

    public void setAmountSum(BigDecimal amountSum) {
        this.amountSum = amountSum;
    }

    public BigDecimal getAmountSumUsdt() {
        return amountSumUsdt;
    }

    public void setAmountSumUsdt(BigDecimal amountSumUsdt) {
        this.amountSumUsdt = amountSumUsdt;
    }

    @Override
    public String toString() {
        return "UserCoinAccountAllVO{" +
                "coinName='" + coinName + '\'' +
                ", userId=" + userId +
                ", amountSum=" + amountSum +
                ", amountSumUsdt=" + amountSumUsdt +
                '}';
    }
}
