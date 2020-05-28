package com.balzzak.goodsservice.controller;

import com.balzzak.goodsservice.model.domain.Goods;
import com.balzzak.goodsservice.model.domain.GoodsItem;
import com.balzzak.goodsservice.model.request.GoodsDTO;

import com.balzzak.goodsservice.service.GoodsBiz;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

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
    public List<Goods> getGoods(@PathVariable long goodsId) {

        List<Goods> list = this.goodsBiz.getGoods(goodsId);
        return list;
    }

    @GetMapping(path = "/items/{goodsItemId}")
    public List<GoodsItem> getGoodsItems(@PathVariable long goodsItemId) {
        // 테이블을 하나로 합칠지 정할 것
        //List<Goods> list = this.goodsBiz.getGoods(goodsItemId);
        return null;
    }

    @GetMapping(path = "/categories/{goodsCategoryId}")
    public List<GoodsItem> getGoodsCategories(@PathVariable long goodsCategoryId) {
        this.goodsBiz.getGoodsCategories(goodsCategoryId);
        return null;
    }

    @PostMapping(path = "")
    public ResponseEntity createGoods(@Valid @RequestBody GoodsDTO req) {

        this.goodsBiz.createGoods(req);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand("여기에 넣을 Id는? 버전Id?")
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/{goodsId}")
    public void deleteGoods(@PathVariable long goodsId) {
        this.goodsBiz.deleteGoods(goodsId);
    }

    @DeleteMapping(path = "/categories/{goodsCategoryId}")
    public void deleteGoodsCategory(@PathVariable long goodsCategoryId) {
        this.goodsBiz.deleteGoodsCategory(goodsCategoryId);
    }


}
