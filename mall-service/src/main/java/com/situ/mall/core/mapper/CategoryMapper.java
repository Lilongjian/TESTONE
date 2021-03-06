package com.situ.mall.core.mapper;

import java.util.List;

import com.situ.mall.common.response.ServerResponse;
import com.situ.mall.core.entity.Category;
import com.situ.mall.core.vo.CategoryCountVo;


public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

	List<Category> selectTopCategory();

	List<Category> selectSecondCategory(Integer topCategoryId);

	Integer selectParentCategoryId(Integer categoryId);

	List<Category> pageList(Category name);

	int deleteAll(String[] idsArray);

	List<Category> selectAll();

	List<CategoryCountVo> getCategoryCountAnalysis();
}