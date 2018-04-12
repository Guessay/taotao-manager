package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author caishuo.cs
 * @date 2018/4/12
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
        return tbItem;
    }
}
