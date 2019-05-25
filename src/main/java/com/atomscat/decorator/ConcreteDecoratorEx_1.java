package com.atomscat.decorator;

/**
 * 第一层装饰处理类
 */
public class ConcreteDecoratorEx_1 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();            //Add additional thing if necessary
        System.out.println("第一层装饰处理：I am explicitly from Ex_1");
    }
}
