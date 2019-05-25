package com.atomscat.iterator;

/**
 * 迭代器接口类
 */
public interface IIterator {
    void First();//Reset to first element

    String Next();//get next element

    Boolean IsDone();//End of collection check

    String CurrentItem();//Retrieve Current Item
}
