package com.balzzak.goodservice.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GoodsDTO {

    private List<GoodsRequest> goods;
    private List<GoodsCategoryRequest> goodsCategories;
    private List<GoodsItemRequest> goodsItems;

    public class GoodsRequest {

    }

    public class GoodsCategoryRequest {

    }

    public class GoodsItemRequest {

    }
}
