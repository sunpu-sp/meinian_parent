package com.atguigu.dao;

import com.atguigu.pojo.Order;

import java.util.List;
import java.util.Map;

public interface OrderDao {
    List<Order> findOrderByCondition(Order orderParam);

    void add(Order order);

    Map<String, Object> findById(Integer orderId);

    int getTodayOrderNumber(String today);

    int getThisWeekAndMonthOrderNumber(Map<String, Object> paramMonth);

    int getThisWeekAndMonthVisitsNumber(Map<String, Object> paramWeekVisit);

    int getTodayVisitsNumber(String today);

    List<Map<String, Object>> findHotSetmeal();
}
