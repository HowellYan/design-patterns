package com.atomscat.abstractFactory;

public interface IMovieFactory {
    ITollywoodMovie GetTollywoodMovie();

    IBollywoodMovie GetBollywoodMovie();
}
