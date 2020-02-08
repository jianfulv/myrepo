package com.itheima.ssm.dao;

import com.itheima.ssm.pojo.Items;

import java.util.List;

/**
 * TODO
 */
public interface ItemsDao {

    /***
     * 查询所有
     * @return
     */
    List<Items> list();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);
}
