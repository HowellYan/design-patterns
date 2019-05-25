package com.atomscat.command;

/**
 * 命令
 */
public class MyUndoCommand implements ICommand {
    private Receiver receiver;

    MyUndoCommand(Receiver recv) {
        receiver = recv;
    }

    public void Do() {
        //Call undo in receiver
        receiver.performUndo();
    }
}
