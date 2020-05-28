package com.balzzak.goodsservice.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GoodsCategory {

    @Id
    @GeneratedValue
    private long categoryId;

    private int sortOrder;

    @Column(nullable = false)
    private String categoryName;

    @Column(nullable = false)
    private Timestamp createDate;

    @Column(nullable = false)
    private Timestamp updateDate;

    @OneToMany
    @JoinColumn(name = "goodsCategoryId")
    private List<GoodsCategoryMap> goods;
}
