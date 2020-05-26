package com.balzzak.goodservice.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@AllArgsConstructor
public class Goods {

    private long goodsId;

    private String goodsName;

    private BigDecimal regularPrice;

    private String description;

    private int saleCode;

    private int saleState;

    private long versionId;

    private Timestamp createDate;

    private Timestamp updateDate;
}
