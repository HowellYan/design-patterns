package com.atomscat.chainOfResponsibility;

public interface IReceiver {
    Boolean ProcessMessage(Message msg);
}
