package com.atomscat.command;

public class MyRedoCommand implements ICommand {
    private Receiver receiver;

    MyRedoCommand(Receiver recv) {
        receiver = recv;
    }

    public void Do() {
        //Call redo in receiver
        receiver.performRedo();
    }
}
