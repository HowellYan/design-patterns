package com.atomscat.singleton.ch04;

public class MakeACaptain {
    private MakeACaptain() {
    }

    /**
     * a) synchronized: 可以解决线程不安全问题。没有synchronized，可能会出现这样的情况:
     * 两个或多个线程同时创建了单例类的多个对象；同步方法缺点是：耗性能
     * b) “延迟初始化”来实现线程安全。
     * c)  private static final
     *
     * @return
     */
    //public static synchronized MakeACaptain getCaptain() {
    public static MakeACaptain getCaptain() {
        // Lazy initialization
        return SingletonHelper._captain;
    }

    /**
     * 该方法不需要使用同步技术和初始化。它被认为是在Java中实现单例的标准方法。
     */
    private static class SingletonHelper {
        private static final MakeACaptain _captain = new MakeACaptain();
    }
}
