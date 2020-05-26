package com.balzzak.goodservice.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
public class GoodsVersion {

    private long versionId;

    private String filePath;

    private Timestamp createDate;

    private Timestamp updateDate;
}
