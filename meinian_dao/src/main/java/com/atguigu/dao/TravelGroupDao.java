package com.atguigu.dao;

import com.atguigu.pojo.TravelGroup;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

public interface TravelGroupDao {
    void add(TravelGroup travelGroup);

    void addTravelGroupAndTravelItem(Map<String, Integer> paramData);

    Page<TravelGroup> findPage(String queryString);

    long findCountByTravelGroupId(Integer id);

    void delete(Integer id);

    TravelGroup getById(Integer id);

    List<Integer> getTravelItemIdsByTravelGroupId(Integer travelGroupId);

    void edit(TravelGroup travelGroup);

    void deleteTravelGroupAndTravelItem(Integer travelGroupId);

    List<TravelGroup> findAll();

    List<TravelGroup> findTravelGroupById(Integer id);
}
