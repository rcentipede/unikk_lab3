package edu.nmu.unik.controller;

import edu.nmu.unik.model.Department;
import edu.nmu.unik.model.Group;
import edu.nmu.unik.model.Human;

import java.util.List;

public class DepartmentCreator implements IStructureCreator<Department, Group> {
    @Override
    public Department createStructure(String name, Human head, List<Group> groups) {
        return new Department(name, head, groups);
    }

    @Override
    public Department createStructure(String name, Human head) {
        return new Department(name, head);
    }

    @Override
    public Department createTypicalEntity() {
        Human head = new HumanCreator().createTypicalEntity();
        return new Department(IEntityCreator.generateRandomWord(), head);
    }
}
