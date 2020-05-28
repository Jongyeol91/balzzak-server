package com.balzzak.goodsservice.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Timestamp;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GoodsItem {

    @Id
    private long goodsId;

    @Column(nullable = false)
    private String itemSN;

    @Column(nullable = false)
    private String imgPath;

    @Column(nullable = false)
    private String thumbnailPath;

    @Column(nullable = false)
    private String countryOfOrigin;

    @Column(nullable = false)
    private Timestamp createDate;

    @Column(nullable = false)
    private Timestamp updateDate;

    @OneToOne
    private Goods goods;
}
