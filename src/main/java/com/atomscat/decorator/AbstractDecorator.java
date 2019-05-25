package com.atomscat.decorator;

/**
 * 装饰抽象类：在基础抽象类添加内容
 */
public abstract class AbstractDecorator extends Component {
    protected Component com;

    public void SetTheComponent(Component c) {
        com = c;
    }

    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }
}
