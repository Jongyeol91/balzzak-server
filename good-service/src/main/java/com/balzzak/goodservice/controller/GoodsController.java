package com.balzzak.goodservice.controller;

import com.balzzak.goodservice.model.domain.Goods;
import com.balzzak.goodservice.model.request.GoodsDTO;
import com.balzzak.goodservice.service.GoodsBiz;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    @PostMapping(path = "")
    public ResponseEntity createGoods(@RequestBody GoodsDTO req) {

        this.goodsBiz.createGoods(req);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand("goods.getId")
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/{goodsId}")
    public void deleteGoods(@PathVariable long goodsId) {
        this.goodsBiz.deleteGoods(goodsId);

    }


}
