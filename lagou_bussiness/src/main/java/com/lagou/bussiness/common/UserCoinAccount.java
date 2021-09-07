package com.lagou.bussiness.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户数字货币数量表
 * </p>
 *
 * @author Tracy
 * @since 2020-05-14
 */
@TableName("tb_user_coin_account")
public class UserCoinAccount implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * uid
     */
    @TableField("uid")
    private Integer uid;

    /**
     * 资金类型，1-钱包，2-法币，3-币币
     */
    @TableField("type")
    private Integer type;

    /**
     * 币种
     */
    @TableField("coin_id")
    private Integer coinId;

    /**
     * 币的简写
     */
    @TableField("coin_name")
    private String coinName;

    /**
     * 区块链上或者平台托管的余额
     */
    @TableField("amount")
    private BigDecimal amount;

    /**
     * 被临时冻结的金额
     */
    @TableField("frozen_amount")
    private BigDecimal frozenAmount;

    /**
     * 版本号
     */
    @TableField("version")
    private Integer version;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return  uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCoinId() {
        return coinId;
    }

    public void setCoinId(Integer coinId) {
        this.coinId = coinId;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserCoinAccount{" +
        "id=" + id +
        ", userId=" + userId +
        ", type=" + type +
        ", coinId=" + coinId +
        ", coinName=" + coinName +
        ", amount=" + amount +
        ", frozenAmount=" + frozenAmount +
        ", version=" + version +
        ", remark=" + remark +
        ", updateTime=" + updateTime +
        ", createTime=" + createTime +
        "}";
    }
}
