package com.github.hcsp.polymorphism;

public class 西红柿炒鸡蛋 extends 菜 {
    @Override
    public void 开始烹饪() {
        System.out.println("放鸡蛋");
        System.out.println("放西红柿");
        System.out.println("炒啊炒啊炒");
    }

    public void 做个西红柿炒鸡蛋() {
        System.out.println("香喷喷的西红柿炒鸡蛋出锅啦");
    }
}
