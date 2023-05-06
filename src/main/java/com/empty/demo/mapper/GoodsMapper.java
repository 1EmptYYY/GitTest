package com.empty.demo.mapper;

import com.empty.demo.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
@Mapper
public interface GoodsMapper {
    /**
     * 查询全部
     * @return
     */

    List<Goods> SelectAlllGoods(Integer goodId);

    /**
     * 通过ID查询Good
     * @param goodId
     * @return
     */
    @Select("SELECT * FROM goods WHERE goodId = #{goodId}")
    Goods SelectGoodsById(Integer goodId);

    /**
     * 通过ID删除Good
     * @param goodId
     */
    @Delete("DELETE FROM goods where goodId = #{goodId}")
    void DeleteGoodsById(Integer goodId);

    /**
     *
     */
    void Update(Goods goods);

}
