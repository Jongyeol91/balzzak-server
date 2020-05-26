package com.balzzak.goodservice.controller;

import com.balzzak.goodservice.service.GoodsBiz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/goods")
@RestController
public class GoodsController {

    private final GoodsBiz goodsBiz;

    public GoodsController(GoodsBiz goodsBiz) {
        this.goodsBiz = goodsBiz;
    }

    // GET
    // [OLD] RequestMapping(method = RequestMethod=GET, path= "/")
    @GetMapping(path = "/{goodsId}")
    public String getGoods(@PathVariable int goodsId) {
        return String.valueOf(goodsId);
    }
}
