package com.company.designpatterns.builder;

public interface Builder<T>{

    Builder<T> addWall();
    Builder<T> addDoor();
    Builder<T> addGarage();
    Builder<T> addGarden();
    Builder<T> addChildRoom();
    Builder<T> reset();
    T getResult();
}
