package com.empty.demo.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private int goodId;
    private String goodName,manufacturer,type,typedescription;
    private int price;


}
