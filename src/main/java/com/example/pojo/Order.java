package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int id_order;
    private int nums_good;
    private double prices_order;

    private Date time_order;

    private Date gmt_create;

    private Date gmt_modified;
}
