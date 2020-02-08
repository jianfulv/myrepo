package com.itheima.ssm.service;

import com.itheima.ssm.pojo.Items;

import java.util.List;

/**
 * TODO
 */
public interface ItemsService {

    /***
     * 列表查询
     * @return
     */
    List<Items> list();

    /***
     * 增加商品
     * @param items
     * @return
     */
    int save(Items items);
}
