package com.example;

import com.example.mapper.GoodMapper;
import com.example.mapper.OrderMapper;
import com.example.pojo.Good;
import com.example.pojo.Order;
import com.example.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class MybatisTest {

    @Test
    public void test() throws IOException {
        System.out.println("------------------------添加后-----------------------------------------");
        Date time = new Date();

//        Good good = new Good(1, 1.0, "book1", time, time);

        Order order = new Order(1,10,10.0,time,time,time);

        Order order_test = new Order(10,111,300,time,time,time);

        Order order_update = new Order(10,500,600,time,time,time);

        SqlSession sqlSession = MybatisUtil.getSqlSession();

//        GoodMapper goodMapper = sqlSession.getMapper(GoodMapper.class);

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

//        goodMapper.insertGood(good);

        orderMapper.insertOrder(order);

        orderMapper.insertOrder(order_test);

        sqlSession.commit();

//        List<Good> goods = goodMapper.getGoodList();

        List<Order> orders = orderMapper.getOrderList();

//        goods.forEach(System.out::println);

        orders.forEach(System.out::println);

        System.out.println("------------------------删除后-----------------------------------------");

        orderMapper.deleteOrder(1);

        orders = orderMapper.getOrderList();

        orders.forEach(System.out::println);

        System.out.println("------------------------修改后-----------------------------------------");

        orderMapper.updateOrder(order_update);

        orders = orderMapper.getOrderList();

        orders.forEach(System.out::println);

        sqlSession.close();
    }
}
