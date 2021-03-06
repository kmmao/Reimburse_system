package com.lgs.entity;

/**
 * @author ：李先生
 * @date ：Created in 2019/8/31 17:02
 * @description：报销单明细实体类
 * @modified By：
 * @version: $
 */
public class ClaimVoucherItem {

    private Integer id;//编号
    private Integer claimVoucherId;//报销单编号
    private String item;//费用类型
    private Double amount;//金额
    private String comment;//描述

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClaimVoucherId() {
        return claimVoucherId;
    }

    public void setClaimVoucherId(Integer claimVoucherId) {
        this.claimVoucherId = claimVoucherId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
