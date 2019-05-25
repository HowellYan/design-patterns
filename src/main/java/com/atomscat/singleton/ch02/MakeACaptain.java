package com.atomscat.singleton.ch02;

public class MakeACaptain {
    private static MakeACaptain _captain;        //We make the constructor private to prevent the use of "new"

    private MakeACaptain() {
    }

    /**
     * a) synchronized: 可以解决线程不安全问题。没有synchronized，可能会出现这样的情况:
     * 两个或多个线程同时创建了单例类的多个对象；同步方法缺点是：耗性能
     * b) “延迟初始化”来实现线程安全。
     * c)  private static final
     * @return
     */
    public static synchronized MakeACaptain getCaptain() {
        // Lazy initialization
        if (_captain == null) {
            _captain = new MakeACaptain();
            System.out.println("New Captain selected for our team");
        } else {
            System.out.print("You already have a Captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return _captain;
    }
}
