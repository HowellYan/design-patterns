package com.atomscat.memento;

/**
 * 守护者
 */
public class Caretaker {
    private Memento _memento;

    /**
     * 保存
     * @param m
     */
    public void SaveMemento(Memento m) {
        _memento = m;
    }

    /**
     * 恢复
     * @return
     */
    public Memento RetrieveMemento() {
        return _memento;
    }

}
