package com.example.mapper;

import com.example.pojo.Good;
import com.example.pojo.Order;

import java.util.List;

public interface GoodMapper {
    List<Good> getGoodList();

    void insertGood(Good good);

    void deleteGood(int a);

    void updateGood(Good good);
}
