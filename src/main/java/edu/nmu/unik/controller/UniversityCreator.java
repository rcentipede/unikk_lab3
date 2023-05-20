package edu.nmu.unik.controller;

import edu.nmu.unik.model.Faculty;
import edu.nmu.unik.model.Group;
import edu.nmu.unik.model.Human;
import edu.nmu.unik.model.University;

import java.util.List;

public class UniversityCreator implements IStructureCreator<University, Faculty> {
    @Override
    public University createStructure(String name, Human head, List<Faculty> faculties) {
        return new University(name, head, faculties);
    }

    @Override
    public University createStructure(String name, Human head) {
        return new University(name, head);
    }

    @Override
    public University createTypicalEntity() {
        Human head = new HumanCreator().createTypicalEntity();
        return new University(IEntityCreator.generateRandomWord(), head);
    }
}
