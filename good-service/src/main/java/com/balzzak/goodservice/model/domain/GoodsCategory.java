package com.balzzak.goodservice.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
public class GoodsCategory {

    private long categoryId;

    private int sortOrder;

    private String categoryName;

    private Timestamp createDate;

    private Timestamp updateDate;
}
