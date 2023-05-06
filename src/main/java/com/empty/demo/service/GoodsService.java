package com.empty.demo.service;


import com.empty.demo.pojo.Goods;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GoodsService {
    List<Goods> SelectAlllGoods(Integer goodId);

    Goods SelectGoodsById(Integer goodId);

    void DeleteGoodsById(Integer goodId);

    void Update(Goods goods);

}
