package edu.nmu.unik.controller;

import edu.nmu.unik.model.Group;
import edu.nmu.unik.model.Human;
import edu.nmu.unik.model.Sex;
import edu.nmu.unik.model.Student;

import java.util.List;

public class GroupCreator implements IStructureCreator<Group, Student> {
    @Override
    public Group createStructure(String name, Human head, List<Student> students) {
        return new Group(name, head, students);
    }

    @Override
    public Group createStructure(String name, Human head) {
        return new Group(name, head);
    }

    @Override
    public Group createTypicalEntity() {
        Human head = new HumanCreator().createTypicalEntity();
        return new Group(IEntityCreator.generateRandomWord(), head);
    }
}
