package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.ItemsDao;
import com.itheima.ssm.pojo.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 */
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public List<Items> list() {
        List<Items> list = itemsDao.list();
        return list;
    }

    public int save(Items items) {
        int rows = itemsDao.save(items);
        return rows;
    }
}
