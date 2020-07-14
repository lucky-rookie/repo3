package com.imooc.demo;

public class ProductDao {
    public void save(){
        System.out.println("保存商品");
    }
    public void delete(){
        System.out.println("删除商品");
    }
    public String update(){
        System.out.println("更新商品");
        return "hello";
    }
    public void findAll(){
        System.out.println("查询所有");
        //int i=1/0;
    }
    public void findOne(){
        System.out.println("单一查询");
//        int i=1/0;
    }
}
