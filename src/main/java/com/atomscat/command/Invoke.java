package com.atomscat.command;

/**
 * 调用者
 */
public class Invoke {
    ICommand cmd;

    public void ExecuteCommand(ICommand cmd) {
        this.cmd = cmd;
        cmd.Do();
    }
}
