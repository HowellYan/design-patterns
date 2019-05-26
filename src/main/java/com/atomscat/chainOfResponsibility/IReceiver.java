package com.atomscat.chainOfResponsibility;

/**
 * 接收方式
 */
public interface IReceiver {
    Boolean ProcessMessage(Message msg);
}
