package edu.nmu.unik.controller;

import edu.nmu.unik.model.Human;

import java.util.List;

public interface IStructureCreator<T, C> extends IEntityCreator<T> {
    T createStructure(String name, Human head, List<C> items);

    T createStructure(String name, Human head);
}
