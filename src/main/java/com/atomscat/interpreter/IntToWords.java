package com.atomscat.interpreter;

public class IntToWords implements IExpression {
    private String str;

    public IntToWords(String str) {
        this.str = str;
    }

    @Override
    public void interpret(Context ic) {
        ic.printInWords(str);
    }
}
