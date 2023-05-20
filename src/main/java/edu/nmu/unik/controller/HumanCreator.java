package edu.nmu.unik.controller;

import edu.nmu.unik.model.Human;

public class HumanCreator implements IEntityCreator<Human> {
    @Override
    public Human createTypicalEntity() {
        return new Human(
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomGender()
        );
    }
}
