package com.balzzak.goodsservice.model.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "상품 기본정보")
@Entity
public class Goods {

    @ApiModelProperty(notes = "상품ID")
    @Id
    @GeneratedValue
    private long goodsId;

    @Column(nullable = false)
    private String goodsName;

    @Column(nullable = false)
    private BigDecimal regularPrice;

    @Column(nullable = false)
    private String description;

    private int saleCode;

    private int saleState;

    private long versionId;

    @Column(nullable = false)
    private Timestamp createDate;

    @Column(nullable = false)
    private Timestamp updateDate;

    @OneToMany
    private List<GoodsCategoryMap> categories;

    @OneToOne
    private GoodsItem goodsItem;
}
