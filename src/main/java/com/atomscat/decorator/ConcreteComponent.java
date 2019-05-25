package com.atomscat.decorator;

/**
 * 具体基础处理类
 */
public class ConcreteComponent extends Component {
    public void doJob() {
        System.out.println(" 基础：I am from Concrete Component-I am closed for modification.");
    }
}
