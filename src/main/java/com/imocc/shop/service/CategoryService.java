package com.imocc.shop.service;

import com.imocc.shop.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {
    /**
     * 查询单个
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查询所有分类
     */
    List<ProductCategory> findAll();

    /**
     * 根据类型获取所分类数据
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 保存一个分类数据
     */
    ProductCategory save(ProductCategory productCategory);
}
