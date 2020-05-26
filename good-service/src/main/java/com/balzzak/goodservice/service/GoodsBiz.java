package com.balzzak.goodservice.service;

import com.balzzak.goodservice.model.domain.Goods;
import com.balzzak.goodservice.model.request.GoodsDTO;
import com.balzzak.goodservice.repository.GoodsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsBiz {

    private final GoodsRepository goodsRepository;

    public GoodsBiz(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    public List<Goods> getGoods(long goodsId) {

        if(goodsId == 0) {

        } else {

        }



        return null;
    }

    public void createGoods(GoodsDTO dto) {

    }

    public void deleteGoods(long goodsId) {

    }

}
