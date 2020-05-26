package com.balzzak.goodservice.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
public class GoodsItem {

    private long goodsId;

    private String itemSN;

    private String imgPath;

    private String thumbnailPath;

    private String countryOfOrigin;

    private Timestamp createDate;

    private Timestamp updateDate;
}
