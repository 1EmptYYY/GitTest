package com.empty.demo.service.Impl;


import com.empty.demo.mapper.GoodsMapper;
import com.empty.demo.pojo.Goods;
import com.empty.demo.pojo.Result;
import com.empty.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> SelectAlllGoods(Integer goodId) {
        return  goodsMapper.SelectAlllGoods(goodId);
    }

    @Override
    public Goods SelectGoodsById(Integer goodId) {
        return goodsMapper.SelectGoodsById(goodId);
    }

    @Override
    public void DeleteGoodsById(Integer goodId) {
        goodsMapper.DeleteGoodsById(goodId);
    }

    @Override
    public void Update(Goods goods) {
        goodsMapper.Update(goods);
    }

}
