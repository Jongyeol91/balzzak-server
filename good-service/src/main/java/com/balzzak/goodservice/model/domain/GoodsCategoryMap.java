package com.balzzak.goodservice.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
public class GoodsCategoryMap {

    private long goodsId;

    private long goodsCategoryId;

    private Timestamp createDate;

    private Timestamp updateDate;
}
