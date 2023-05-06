package com.empty.demo.controller;


import com.empty.demo.pojo.Goods;
import com.empty.demo.pojo.Result;
import com.empty.demo.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * 查询全部Goods
     * @return
     */
    @GetMapping
    private Result SelectAlllGoods(Integer goodId){
        List<Goods> goods = goodsService.SelectAlllGoods(goodId);
        return Result.success(goods);
    }

    /**
     * 根据ID查询
     * @param goodId
     * @return
     */
//    @GetMapping
//    private Result SelectGoodsById(Integer goodId){
//        Goods goods = goodsService.SelectGoodsById(goodId);
//        return Result.success(goods);
//    }

    /**
     * 根据ID删除
     * @param goodId
     * @return
     */
    @DeleteMapping
    private Result DeleteGoodsById(Integer goodId){
        goodsService.DeleteGoodsById(goodId);
        return Result.success();
    }

    /**
     * 根据ID修改
     * @param goods
     * @return
     */
    @PutMapping
    private Result Update(@RequestBody Goods goods){
        goodsService.Update(goods);
        return Result.success();
    }






}
