package com.honeywen.credit.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 事件展示dto
 * @author weiw@opera.com
 * @date 2018/9/25 下午8:55
 */
public @Data @Builder class EventDTO implements Serializable {

    private String title;
    private String start;
    private String end;
    private String color;

}
