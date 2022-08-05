package com.imocc.shop.repository;

import com.imocc.shop.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    void findByCategoryTypeIn() {
        List<Integer> categoryTypeList = new ArrayList<>();
        categoryTypeList.add(13);
        categoryTypeList.add(5);
        categoryTypeList.add(6);

        List<ProductCategory> productCategoryList = repository.findByCategoryTypeIn(categoryTypeList);

        for (ProductCategory productCategory : productCategoryList) {
            System.out.println(productCategory);
        }
    }

    @Test
    void save() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("传奇手游");
        productCategory.setCategoryType(13);
        ProductCategory save = repository.save(productCategory);
    }
}