package com.atomscat.command;

/**
 * 客户机，客户端持有调用程序和命令对象
 */
public class CommandPatternEx {
    public static void main(String[] args) {
        System.out.println("***Command Pattern Demo***\n");
        Receiver intendedreceiver = new Receiver();             // 接收者
        /*Client holds Invoker and Command Objects*/
        Invoke inv = new Invoke(); // 调用者
        MyUndoCommand unCmd = new MyUndoCommand(intendedreceiver);
        MyRedoCommand reCmd = new MyRedoCommand(intendedreceiver);
        inv.ExecuteCommand(unCmd);
        inv.ExecuteCommand(reCmd);
    }
}
