package com.imocc.shop.repository;

import com.imocc.shop.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    /**
     * 可以通过多个类型 创建一个列表 来获取商品分类数据
     * @param categoryTypeList 类型列表
     * @return list
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
