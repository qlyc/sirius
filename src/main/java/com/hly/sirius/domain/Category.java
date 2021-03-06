package com.hly.sirius.domain;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/16
 */
public class Category {

    private int categoryId;
    private String categoryName;
    private int categoryOrder;
    private int categoryArticleNum;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(int categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    public int getCategoryArticleNum() {
        return categoryArticleNum;
    }

    public void setCategoryArticleNum(int categoryArticleNum) {
        this.categoryArticleNum = categoryArticleNum;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryOrder=" + categoryOrder +
                ", categoryArticleNum=" + categoryArticleNum +
                '}';
    }
}
