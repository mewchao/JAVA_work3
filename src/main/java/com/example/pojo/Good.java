package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Good {
    private int uk_id_goods;
    private double price_goods;
    private String name_goods;
    private Date gmt_create;
    private Date gmt_modified;
}
