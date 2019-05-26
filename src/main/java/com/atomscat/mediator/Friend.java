package com.atomscat.mediator;

public abstract class Friend {
    public String name;
    protected Mediator mediator;

    // Constructor
    public Friend(Mediator _mediator) {
        mediator = _mediator;
    }
}
