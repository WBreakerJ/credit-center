package com.honeywen.credit.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wangwei on 2017/9/10.
 */
public @Data class Card {


    private Integer id;
    /**
     * 卡片名称
     */
    private String name;

    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 所属银行ID
     */
    private Integer bankId;
    /**
     * 卡片类型 1. 贷记卡 2.储蓄卡
     */
    private String cardType;
    /**
     * 卡片额度
     */
    private BigDecimal cardLimit;
    /**
     * 账单日
     */
    private Integer billDay;
    /**
     * 还款日类型 1.固定还款日 2.账单日后多少天
     */
    private Integer repayDayType;
    /**
     * 还款日记数
     * 如果是固定还款日，就是还款日
     * 如果是账单日后多少天， 就是多少天
     */
    private Integer repayDayNum;
    /**
     * 卡片状态 1，启用中
     */
    private Integer status;

    private Date createAt;
    private Integer createBy;
    private Date updateAt;
    private Integer updateBy;
    private Integer deleteFlag;





}